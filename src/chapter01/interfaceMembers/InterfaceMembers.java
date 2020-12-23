package chapter01.interfaceMembers;

public interface InterfaceMembers {
    int value = 3; // implicit -> public static final

    void printSomething(); // iplicit -> public abstract

    default void printHello() { // implicit -> public
        System.out.println("Hello");
    }

    static void printStatic() { // implicit -> public
        System.out.println("Static method");
    }

    private void printPrivate() {
        System.out.println("Private");
    }

    private static void printPrivateStatic() {
        System.out.println("PrivateStatic");
    }
}
