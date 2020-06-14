package rcs.rafahcsilva.javaoo;

public class Main {

    public static void main(String[] args) {
        // Encapsulamento
        Person person = new Person();
        person.setName("Rafao");
        person.setAge(26);
        person.setCpf("123.123.123-12");
        person.say();
        System.out.println(Person.walk());
        System.out.println("Name: " + person.getName());

        Person person2 = new Person("Cardoso", 50);
        System.out.println("Name: " + person2.getName());


        // Herança
        Car car1 = new Car();
        car1.setColor("Blue");
        car1.setTopSpeed(220.0);
        car1.setShifts(5);
        System.out.println(car1.getColor() + " " + car1.getShifts());

        Car car2 = new Car("Red", 190.0);
        System.out.println(car2.getColor() + " " + car2.getTopSpeed());


        // Composition
        CarComposition carComposition = new CarComposition();
        carComposition.getVehicle().setColor("Green");
        carComposition.getVehicle().setTopSpeed(250.0);
        System.out.println(carComposition.getVehicle().getColor() + " " + carComposition.getVehicle().getTopSpeed());

    }
}
