package chapter01;

/*
Final variables
 */
public class FinalModifier {
    public static void main(String[] args) {
        final int initalized = 5;
        final int uninitalized;
        uninitalized = 10;
        /*
        Object reference is constant, but that doesn't mean the data in variable is constant!
         */
        final StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Hip");
        stringBuilder.append("Hop");
        System.out.println("StringBuilder - " + stringBuilder.toString());
    }
}

/*
Final instance and static variables
 */
class PolarBear {
    final int age = 10;
    final int fishEaten;
    final String name;
    final static int height;

    static {
     height = 110;
    }

    {
        fishEaten = 10;
    }

    public PolarBear() {
        name = "Robert";
    }
}

/*
Final Methods
 */
abstract class Animal {
    abstract void chew();
}

class Hippo extends Animal {
    @Override
    final void chew() { // We can't override method when is marked as final.
    }
}

class PygmyHippo extends Hippo {
    // Does not compile, we can't override method, which is marked as final.
//    void chew() {
//
//    }
}

abstract class ZooKeeper {
    // We can't use abstract and final together, it
//    public abstract final void openZoo();
}

/*
Final classes
 */
final class Reptile {}

// Doesn not compile, we can't extends class which is marked as final.
//class Snake extends Reptile {}

