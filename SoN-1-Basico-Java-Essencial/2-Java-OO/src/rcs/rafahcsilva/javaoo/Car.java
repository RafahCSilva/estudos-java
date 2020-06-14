package rcs.rafahcsilva.javaoo;

public class Car extends Vehicle {
    private Integer shifts;

    public Car() {
        super();
    }

    public Car(String color, Double topSpeed) {
        super(color, topSpeed);
    }

    public Integer getShifts() {
        return shifts;
    }

    public void setShifts(Integer shifts) {
        this.shifts = shifts;
    }

    public void methodOverriding() {
        System.out.println("This is a method form Child Class overriding");
    }
}
