package rcs.rafahcsilva;

import java.lang.annotation.*;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
public @interface Info {
    String createdBy() default "Rafael";
}
