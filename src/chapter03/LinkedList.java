package chapter03;

public class LinkedList<S> {
    public static void main(String[] args) {
        java.util.LinkedList<String> strings = new java.util.LinkedList<>();
        strings.offer("Ala");
        strings.offer("ma");
        strings.offer("kota");
        System.out.println(strings);
        System.out.println(strings.pop());
        System.out.println(strings.element());
    }
}
