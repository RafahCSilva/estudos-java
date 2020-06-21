package rcs.rafahcsilva.java8;

import java.lang.reflect.Array;
import java.util.*;
import java.util.stream.Collectors;
import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.Period;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("Hi Java 8");

        // Runnable
        Runnable run = new Runnable() {
            @Override
            public void run() {
                System.out.println(" > Hi from thread");
            }
        };
        System.out.println("Starting Thread1...");
        new Thread(run).start();

        // Lambda
        Runnable run1 = () -> System.out.println(" > Hi from lambda");
        System.out.println("Starting Thread2...");
        new Thread(run1).start();
        new Thread(() -> System.out.println(" > Hi from Anonymous Lambda")).start();

        // Lambdas in
        List<String> strs = Arrays.asList("Rafael", "Cardoso", "Silva");
        for (String s : strs) {
            System.out.println(s);
        }
        strs.forEach(s -> System.out.println(s));

        List<String> result = strs
                .stream()
                .filter(s -> s.startsWith("C"))
                .collect(Collectors.toList());
        result.forEach(System.out::println);


        // Method References - For only Static Methods
        result.forEach(s -> Person.say(s));
        result.forEach(Person::say);


        // Functional annotations
        // In Java 7 - new and need implements the method body for this instance
        MyInterface myInterface = new MyInterface() {
            @Override
            public void print(String s) {
                System.out.println("Java 7 implementation for Function Interface");
            }
        };
        myInterface.print("");

        // In Java 8 - method body with a lambda
        MyInterface myInterface1 = (s) -> System.out.println("Java 8 implementation for Function Interface " + s);
        myInterface1.print("");

        result.forEach(myInterface1::print);

        // Interface with implementation body
        myInterface1.body1();


        // Stream => Collections with Fluent API
        // filtering
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        List<Integer> filteredNumbers = numbers.stream()
                .filter(n -> n % 2 == 0)
                .collect(Collectors.toList());
        filteredNumbers.forEach(System.out::println);

        // In parallel
        List<String> texts = Arrays.asList("a", "b", "", "", "c", "d");
        List<String> filteredTexts = texts.parallelStream()
                .filter(s -> !s.isEmpty())
                //.limit(2)
                .collect(Collectors.toList());
        filteredTexts.forEach(System.out::println);

        // limit and sort
        Random hash = new Random();
        hash.doubles()
                .limit(3)
                .sorted()
                .forEach(System.out::println);

        // Concat
        System.out.println(filteredTexts
                .stream()
                .collect(Collectors.joining(", ")));


        // Optional
        List<Person> people = new ArrayList<Person>();
        Person person1 = new Person("Rafael");
        Person person2 = new Person("Cardoso");
        Person person3 = new Person("Silva");
        Person person4 = new Person(null);
        people.add(person1);
        people.add(person2);
        people.add(person3);
        people.add(person4);
        people.forEach(p -> System.out.println(p.getName()));

        // Optional faz um wrapper para tratar o IS_NULL()
        Optional<Person> op = Optional.of(person1);
        op.ifPresent(System.out::print);
        op.ifPresent(p -> System.out.println(p.getName()));

        String name = person4.getName();
        Optional<String> opName = Optional.ofNullable(name);
        opName.ifPresent(System.out::print);


        // Api of Date-Time => Carbon no Java
        Instant now = Instant.now();
        System.out.println(now);

        Thread.sleep(1000);
        Instant now2 = Instant.now();

        Duration dur = Duration.between(now, now2);
        System.out.println("Duration: " + dur.getSeconds());

        LocalDate local = LocalDate.now();
        System.out.println(local);

        LocalDate birthday = LocalDate.of(1994, 4, 9);
        Period period = Period.between(birthday, local);
        System.out.printf("My Age is %s %s %s", period.getYears(), period.getMonths(), period.getDays());

        local.plusDays(1);

    }
}
