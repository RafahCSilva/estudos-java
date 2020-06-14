package rcs.rafahcsilva;

import rcs.rafahcsilva.default_code.Default;
import rcs.rafahcsilva.private_code.Private;
import rcs.rafahcsilva.protected_code.Protected;
import rcs.rafahcsilva.protected_code.Second;
import rcs.rafahcsilva.public_code.Public;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        System.out.println("Hello World!");
        new Public();
        new Private();
        new Protected();
        new Second();
        new Default();
    }
}
