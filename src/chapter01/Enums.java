package chapter01;

/*
Enums can not be extended!
 */

import static chapter01.Season.SUMMER;

public class Enums {
    public static void main(String[] args) {
        for (Season season: Season.values()) {
            System.out.println(season.name() + " " + season.ordinal());
        }
        // Another method
        Season s = Season.valueOf("SUMMER");
        System.out.println(s);
        Season season = SUMMER;
        switch (season) {
            case SUMMER:
                System.out.println("It's summer!");
                break;
            case FALL:
                System.out.println("Ir's fall!");
                break;
        }

        // Calling enum method - two app
        Season2 fall = Season2.FALL;
        fall.printExpectedVisitors();
        Season2.FALL.printExpectedVisitors();

//        switch (SUMMER) {
//            case Season.SPRING:
//                System.out.println("It's spring!");
//                break;
//            case Season.WINTER:
//                System.out.println("Ir's winter!");
//                break;
//        }
    }
}

enum Season {
    // We can use snake case with enums eg. MINT_CHOCOLATE
    WINTER,
    SPRING,
    SUMMER,
    FALL
    /*
    In this case, semicolon is optional, but is required when we
    have any fields, constructors etc.!

    Enum is a type of class that mainly contains static members, so
    we can compare them using == or equals().
     */
}

enum Season2 {
    WINTER("Low"),
    SPRING("Medium"),
    SUMMER("High"),
    FALL("Medium");

    private final String expectedVisitors; // This is good coding practice -> whole enum is immutable.

    Season2(String expectedVisitors) { // Constructors are implicit private, they can't be public or protected.
        this.expectedVisitors = expectedVisitors;
    }

    public void printExpectedVisitors() {
        System.out.println(expectedVisitors);
    }
}
