package chapter01.review01;

public interface Herbivore {
    /*
    line 7 == line 8
     */
    int amount = 10;
    public static final int amoun2 = 10;
    static boolean gather = true;
    static void eatGrass() {}
//    int findMore() {
//        return 2;
//    }
    default float rest() {
        return 2;
    }
//    protected int chew() {
//        return 13;
//    }
    private static void eatLeaves() {}
}
