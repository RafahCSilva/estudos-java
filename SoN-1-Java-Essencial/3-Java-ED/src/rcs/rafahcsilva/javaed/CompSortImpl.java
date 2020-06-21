package rcs.rafahcsilva.javaed;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CompSortImpl {
    public static void main(String[] args) {
        List<Person> arr = new ArrayList<Person>();
        arr.add(new Person("A", 45));
        arr.add(new Person("B", 25));
        arr.add(new Person("C", 34));
        arr.add(new Person("D", 20));

        for (Person p : arr) {
            System.out.println(p.getName() + " " + p.getAge());
        }
        System.out.println("");

        Collections.sort((List) arr);
        for (Person p : arr) {
            System.out.println(p.getName() + " " + p.getAge());
        }
    }
}
