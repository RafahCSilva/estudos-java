package rcs.rafahcsilva.java8;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
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
    }
}
