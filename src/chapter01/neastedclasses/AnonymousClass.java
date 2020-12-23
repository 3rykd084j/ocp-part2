package chapter01.neastedclasses;

public class AnonymousClass {
    /*
    With absract class
     */
    abstract class SaleTodayOnly {
        abstract int dollarsOff();
    }

    public int admission(int basePrice) {
        SaleTodayOnly sale = new SaleTodayOnly() {
            @Override
            int dollarsOff() { // DEFAULT
                return 3;
            }
        };
        return basePrice - sale.dollarsOff();
    }

    /*
    With interface
     */
    interface SaleTodayOnly2 {
        int dollarsOff();
    }

    public int admission2(int basePrice) {
        SaleTodayOnly2 sale2 = new SaleTodayOnly2() {
            @Override
            public int dollarsOff() { // PUBLIC
                return 3;
            }
        };
        return basePrice - sale2.dollarsOff();
    }

}
