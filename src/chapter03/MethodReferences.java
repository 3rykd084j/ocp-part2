package chapter03;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class MethodReferences {
    public static void main(String[] args) {
        /*
        Calling static method
         */
        Consumer<List<Integer>> methodRef = Collections::sort;
        Consumer<List<Integer>> lambda = x -> Collections.sort(x);

        /*
        Calling instance methods on a particular Object
         */
        var str = "abc";
        Predicate<String> methodRef2 = str::startsWith;
        Predicate<String> lambda2 = s -> str.startsWith(s);

        /*
        Calling instance methods on a parameter
         */
        Predicate<String> methodRef3 = String::isEmpty;
        Predicate<String> lambda3 = s -> s.isEmpty();

        /*
        Calling constructors
         */
        Supplier<List<String>> methodRef4 = ArrayList::new;
        Supplier<List<String>> lambda4 = () -> new ArrayList();
    }
}
