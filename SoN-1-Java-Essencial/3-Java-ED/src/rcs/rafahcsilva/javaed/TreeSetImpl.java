package rcs.rafahcsilva.javaed;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetImpl {
    public static void main(String[] args) {
        TreeSet<Integer> tree = new TreeSet<Integer>();
        tree.add(2);
        tree.add(5);
        tree.add(7);

        System.out.println(tree);


        Iterator<Integer> iterator = tree.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
        System.out.println(tree.last());

        System.out.println(tree.pollFirst());
        System.out.println(tree.pollLast());
        System.out.println(tree.isEmpty());
    }
}
