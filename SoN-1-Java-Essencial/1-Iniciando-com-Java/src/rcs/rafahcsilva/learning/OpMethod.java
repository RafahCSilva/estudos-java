package rcs.rafahcsilva.learning;

import java.util.Scanner;

public class OpMethod {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        Double a;
        Double b;
        String op;
        Double result = 0.0;

        System.out.println("Number A? ");
        a = reader.nextDouble();

        System.out.println("Number B? ");
        b = reader.nextDouble();

        reader.nextLine();
        System.out.println("Operation (+, -, *, /)? ");
        op = reader.nextLine();


        if (op.equals("+")) {
            result = sum(a, b);
        } else if (op.equals("-")) {
            result = sub(a, b);
        } else if (op.equals("*")) {
            result = mul(a, b);
        } else if (op.equals("/")) {
            result = div(a, b);
        } else {
            System.err.println("Operation not found");
        }

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
