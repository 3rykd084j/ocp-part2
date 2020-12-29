package chapter03;

public class GenericStaticMethod {
    public static void main(String[] args) {
        GenericStaticMethod.prepare(12);
        GenericStaticMethod.prepare("Heh");
        GenericStaticMethod.<String>prepare("Heh heh");
        GenericStaticMethod.<Double>prepare(22.0d);
    }
    public static <T> void prepare(T t) {
        System.out.println("Preparing " + t);
    }
}
