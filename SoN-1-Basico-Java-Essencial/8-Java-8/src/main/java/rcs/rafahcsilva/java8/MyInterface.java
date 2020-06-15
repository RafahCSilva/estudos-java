package rcs.rafahcsilva.java8;

@FunctionalInterface
public interface MyInterface {
    void print(String s);

    default void body1() {
        System.out.println("This is my interface function body");
    }
}
