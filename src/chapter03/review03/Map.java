package chapter03.review03;

import java.util.HashMap;

public class Map {
    public static void main(String[] args) {
        var map = new HashMap<Integer, Integer>(10);
        for (int i = 0; i <= 10; i++) {
            map.put(i, i * i);
        }
        System.out.println(map.get(4));
    }
}
