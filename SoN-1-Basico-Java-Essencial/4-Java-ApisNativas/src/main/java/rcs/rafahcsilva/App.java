package rcs.rafahcsilva;

import rcs.rafahcsilva.default_code.Default;
import rcs.rafahcsilva.private_code.Private;
import rcs.rafahcsilva.protected_code.Protected;
import rcs.rafahcsilva.protected_code.Second;
import rcs.rafahcsilva.public_code.Public;

import java.lang.annotation.Annotation;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        System.out.println("Hello World!");

        // Encapsulamento
        new Public();
        new Private();
        new Protected();
        new Second();
        new Default();


        // Java.Lang - Object
        Public pub = new Public();
        Object obj = new Object();
        System.out.println(obj.toString());
        System.out.println(pub.toString());


        // Java.Lang - Wrappers
        Integer one = 1;
        int two = 2;
        Double d1 = 0.0;
        String str1 = d1.toString();


        // Java.Lang - Annotations
        Class<Public> pubClass = Public.class;
        if (pubClass.isAnnotationPresent(Info.class)) {
            Annotation annotation = pubClass.getAnnotation(Info.class);
            Info info = (Info) annotation;
            System.out.println("@Info eh " + info.createdBy());
        }

    }
}
