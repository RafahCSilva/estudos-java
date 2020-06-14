package rcs.rafahcsilva.learning;

import java.util.Scanner;

public class IO {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in); // input

        // sout <- snippet para System.out.println()
        System.out.println("Whats your name?");

        String name = reader.nextLine(); // input
        System.out.println("Nice to meet you " + name);
        System.err.println("this is a Output Error");
    }
}
