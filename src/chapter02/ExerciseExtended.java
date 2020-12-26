package chapter02;

public @interface ExerciseExtended {
    /*
    Implicit modifier -> public abstract
     */
    int hoursPerDay(); // It look like a method, but this is element/attribute.
    int startHours() default 6;
//    int test() default null; // attribute can't be null
//    int test2() default new Object(); // attribute must be consatnt value
    /*
    Implicit modifier -> public static final
     */
    int someValue = 10;
 }
