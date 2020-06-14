package rcs.rafahcsilva.javaed;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class ArrSync {
    public static void main(String[] args) {
        List<String> list = Collections.synchronizedList(new ArrayList<String>());

        list.add("a");
        list.add("b");
        list.add("c");

        synchronized (list) {
            Iterator<String> itarator = list.iterator();
            while (itarator.hasNext()) {
                System.out.println(itarator.next());
            }
        }

        // Nao precisa sincronizar
        List<String> list2 = new CopyOnWriteArrayList<String>();
        list2.add("a");
        list2.add("b");
        list2.add("c");
    }
}
