package rcs.rafahcsilva.javaed;

import java.util.Random;
import java.util.Stack;

public class StackImpl {
    public static void main(String[] args) {
        Stack stack = new Stack();
        Random random = new Random();

        int i = 5;
        while (i != 0) {
            System.out.println("Push: " + stack.push(random.nextInt(20)));
            i--;
        }

        System.out.println("");

//        for (int c = 0; c < 5; c++) {
        while (!stack.isEmpty()) {
            System.out.println("Pop: " + stack.pop());
        }
    }
}
