package chapter01.neastedclasses;

public class StaticNestedClass {
    static class Nested {
        private int price = 6;
    }
    public static void main(String[] args) {
        Nested nested = new Nested();
        System.out.println(nested.price);
    }
}
