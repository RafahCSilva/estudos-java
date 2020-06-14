package rcs.rafahcsilva.learning;

import java.util.Scanner;

public class OpMethod {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        Double a;
        Double b;

        System.out.println("Number A? ");
        a = reader.nextDouble();

        System.out.println("Number B? ");
        b = reader.nextDouble();

        Double result = sum(a, b);
        System.out.println(result);
    }

    public static Double sum(Double a, Double b) {
        return a + b;
    }

    public static Double sub(Double a, Double b) {
        return a - b;
    }

    public static Double mul(Double a, Double b) {
        return a * b;
    }

    public static Double div(Double a, Double b) {
        return a / b;
    }
}
