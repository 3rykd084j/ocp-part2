package chapter01.interfaceMembers;

interface Walk {
    default int getSpeed() {
        return 5;
    }
}

interface Run {
    default int getSpeed() {
        return 10;
    }
}
/*
Will not compile, because Java don't know what to return, 5 or 10? We have to override this method.
 */
//class DiamentProblem3 implements Walk, Run {
//    public static void main(String[] args) {
//        System.out.println(new DiamentProblem().getSpeed());
//    }
//}

/*
How to solve this problem? Let's see
 */
public class DiamentProblem implements Walk, Run {
    public static void main(String[] args) {
        System.out.println(new DiamentProblem().getSpeed());
    }

    @Override
    public int getSpeed() {
        return 1;
    }
}

/*
How to call hidden method? getSpeed from Walk interface?
 */
class DiamentProblem2 implements Walk, Run {
    public static void main(String[] args) {
        System.out.println(new DiamentProblem().getSpeed());
    }

    @Override
    public int getSpeed() {
        return Walk.super.getSpeed();
    }
}