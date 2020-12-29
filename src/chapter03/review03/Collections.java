package chapter03.review03;

import java.util.HashMap;
import java.util.HashSet;

public class Collections {
    public static void main(String[] args) {
//        HashSet<Number> hs = new HashSet<Integer>();
        HashSet<? super ClassCastException> set = new HashSet<Exception>();
//        ArrayList<> list = new ArrayList<>();
//        List<Object> values = new HashSet<Object>();
//        List<Object> objects = new ArrayList<? extends Object>();
        Map<String, ? extends Number> hm = new HashMap<String, Integer>();
    }
}
