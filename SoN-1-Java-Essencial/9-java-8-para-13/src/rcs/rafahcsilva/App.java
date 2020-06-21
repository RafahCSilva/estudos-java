package rcs.rafahcsilva;

import java.util.HashSet;
import java.util.Set;
import java.util.stream.Stream;

public class App {
    public static void main(String[] args) {
        System.out.println("Ola");

        //  Helper do Set
        //  Antigamente
        // Set<String> listSet = new HashSet<String>();
        // listSet.add("ASDF");
        // listSet.add("ASDF");
        // listSet.add("ASDF");
        //  Agora
        Set<String> listSet = Set.of("A", "B", "C");


        // Iterate com seed
        Stream.iterate(2, number -> number * 2)
                .limit(40)
                .forEach(n -> System.out.println(n));
    }
}
