package chapter01.review01;

public class IceCream {
    enum Flavors {
        CHOCOLATE, STRAWBERRY, VANILLA
    }

    public static void main(String[] args) {
        Flavors STRAWBERRY = null;
        /*
        Compilation error! We have to use only values from enum!
         */
//        switch (STRAWBERRY) {
//            case Flavors.VANILLA:
//                System.out.println("v");
//            case Flavors.CHOCOLATE:
//                System.out.println("c");
//            case Flavors.STRAWBERRY:
//                System.out.println("s");
//                break;
//            default:
//                System.out.println("Missing flavour");
//        }
    }
}
