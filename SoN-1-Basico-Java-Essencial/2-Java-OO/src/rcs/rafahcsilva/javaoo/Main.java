package rcs.rafahcsilva.javaoo;

public class Main {

    public static void main(String[] args) {
        Person person = new Person();

        person.name = "Rafao";
        person.age = 26;
        person.cpf = "123.123.123-12";

        person.say();

        System.out.println(Person.walk());

        System.out.println("Name: " + person.name);
    }
}
