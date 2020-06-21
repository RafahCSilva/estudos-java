package rcs.rafahcsilva;

import java.util.HashSet;
import java.util.Set;
import java.util.stream.Stream;

public class App {
    public static void main(String[] args) throws Exception {
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


        // Strings
        String stg = "Hello \n" + "World";
        System.out.println(stg);

        String multiline = """
                Hello
                World
                """;
        System.out.println(multiline);

        Stream<String> lines = multiline.lines();
        lines.forEach(System.out::println);


        Integer status = 1;
        switch (status) {
            case 1 -> System.out.println("Numero 1");
            case 2 -> System.out.println("Numero 2");
            case 3 -> {
                System.out.println("Numero 1");
            }
            default -> throw new Exception("Default");
        }

        Integer status2 = 2;
        Integer n = switch (status2) {
            case 1:
                System.out.println("Numero 1");
                yield 1;
            case 2:
                System.out.println("Numero 2");
                yield 2;
            default:
                throw new Exception("Default");
        };
        System.out.println(n);
    }
}
