package chapter01.review01;

public class FlavorsEnum {
    enum Flavors {
        VANILLA, CHOCOLATE, STRAWBERRY; // SEMICOLON IS REQUIRED, if enum contains more than values!
        static final Flavors DEFAULT = STRAWBERRY;
    }

    public static void main(String[] args) {
        for (final var e : Flavors.values()) {
            System.out.print(e.ordinal() + " ");
        }
    }
}
