package rcs.rafahcsilva.javaed;

import java.util.Vector;

public class VectorImpl {
    public static void main(String[] args) {
        int[] arr = new int[10];
        arr[0] = 1;
        //arr[1] = "5";


        Vector v = new Vector<>(2, 3);
        v.addElement(1);
        v.addElement(2);
        v.addElement(3);
        v.addElement("5");
        System.out.println(v.size());
//        v.remove(0);
        System.out.println(v.capacity());
//
//        while (v.iterator().hasNext()) {
//            System.out.println(v.iterator().next());
//        }

    }
}
