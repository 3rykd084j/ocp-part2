package chapter01.review01;

public class Ghost {
    public static void boo() {
        System.out.println("Not scared!");
    }
    protected final class Spirit {
        public void boo() {
            System.out.println("Booo!!!");
        }
    }

    public static void main(String[] args) {
        /*
        We try create here anonymous class, but class Spirit is marked final!!
         */
//        var g = new Ghost().new Spirit() {};
        var g = new Ghost().new Spirit();
        System.out.println("Calling: g.boo();");
        g.boo();

        // Doesn't work!
//        g.super.boo();

        System.out.println("Calling: new Ghost().boo();");
        new Ghost().boo();

        // Doesn't work!
//        g.Ghost.boo();

        // Doesnt' work
//        new Spirit().boo();

        System.out.println("Calling: Ghost.boo();");
        Ghost.boo();
    }
}
