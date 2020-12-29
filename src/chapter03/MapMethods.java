package chapter03;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapMethods {
    public static void main(String[] args) {
        HashMap<String, String> map = new HashMap<>();
        System.out.println(map.put("Klucz", "Value1"));
        System.out.println(map.containsKey("Klucz"));
        System.out.println(map.containsValue("Value1"));
        System.out.println(map.containsValue("Value2"));
        System.out.println(map);
        map.clear();
        System.out.println(map);
        map.put("Klucz", "Wartosc");
        map.putIfAbsent("KLUCZ", "");
        Collection<String> values = map.values();
        System.out.println(values);
        Set<String> strings = map.keySet();
        System.out.println(strings);
        Set<Map.Entry<String, String>> entries = map.entrySet();
        System.out.println(entries);
    }
}
