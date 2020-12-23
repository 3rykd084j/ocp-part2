package chapter01.neastedclasses;

public class LocalClass {
    private int length = 5; // effectively final
    public void calculate() {
        final int width = 20;
        class MyLocalClass {
            public void multiply() {
                System.out.println(length * width);
            }
        }
        MyLocalClass myLocalClass = new MyLocalClass();
        myLocalClass.multiply();
    }

    public static void main(String[] args) {
        LocalClass outer = new LocalClass();
        outer.calculate();
    }
}
