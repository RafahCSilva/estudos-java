package rcs.rafahcsilva.javaoo;

public class Person {
    public String name;
    public Integer age;
    public String cpf;

    public Person() {
    }

    public Person(String name, Integer age) {
        this.name = name;
        this.age = age;
    }


    public void say() {
        System.out.println("I'm saying something...");
    }

    public static String walk() {
        return "I'm walking...";
    }
}
