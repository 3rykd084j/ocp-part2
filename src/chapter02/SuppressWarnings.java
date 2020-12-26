package chapter02;

import java.util.ArrayList;
import java.util.List;

public class SuppressWarnings {
    @Deprecated
    static void sing(int volume) {}

    static Object chrip(List<String> data) {
        return data.size();
    }
}

class Nightingale {
    @java.lang.SuppressWarnings("deprecation")
    public void wakeUp() {
        SuppressWarnings.sing(10);
    }
    @java.lang.SuppressWarnings("unchecked")
    public void goToBed() {
        SuppressWarnings.chrip(new ArrayList());
    }
    public static void main(String[] args) {
        var birdy = new Nightingale();
        birdy.wakeUp();
        birdy.goToBed();
    }
}
