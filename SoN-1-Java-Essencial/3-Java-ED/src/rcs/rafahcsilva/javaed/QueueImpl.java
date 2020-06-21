package rcs.rafahcsilva.javaed;

import java.util.LinkedList;
import java.util.Queue;

public class QueueImpl {
    public static void main(String[] args) {
        Queue queue = new LinkedList<>();

        System.out.println("Add: " + queue.add("a"));
        System.out.println("Add: " + queue.add("b"));

        System.out.println("Element: " + queue.element());
        System.out.println("Poll: " + queue.poll());
        System.out.println("Element: " + queue.element());
    }
}
