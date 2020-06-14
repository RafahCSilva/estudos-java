package rcs.rafahcsilva.javaoo;

public class Main {

    public static void main(String[] args) {
        Person person = new Person();
        person.setName("Rafao");
        person.setAge(26);
        person.setCpf("123.123.123-12");
        person.say();
        System.out.println(Person.walk());
        System.out.println("Name: " + person.getName());

        Person person2 = new Person("Cardoso", 50);
        System.out.println("Name: " + person2.getName());
    }
}
