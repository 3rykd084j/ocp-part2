package chapter02;

import java.lang.annotation.Documented;

@Documented
public @interface ValueElement {
    int age() default 18;
    String value(); // This isn't normal attribute!
}
