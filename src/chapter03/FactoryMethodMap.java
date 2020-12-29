package chapter03;

import java.util.Map;

public class FactoryMethodMap {
    public static void main(String[] args) {
        Map<String, String> map1 = Map.of("key1", "value1", "key2", "value2");
        Map<String, String> map2 = Map.ofEntries(
                Map.entry("key1", "value1"),
                Map.entry("key2", "value2")
        );
        /*
        The second approach is much better!
         */
    }
}
