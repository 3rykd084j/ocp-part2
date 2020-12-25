package chapter01.review01;

public interface BigCat {
    abstract String getName();
    static int hunt() {
//        getName();
        return 5;
    }
    default void climb() {
        rest();
    }
    default void roar() {
        getName();
        climb();
        hunt();
    }
    private static boolean sneak() {
//        roar();
        return true;
    }
    private int rest() {
        getName();
        return 2;
    }
}
