package chapter03;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FactoryMethodLists {
    public static void main(String[] args) {
        Integer tab [] = {0, 11, 222};
        ArrayList<Integer> integers = new ArrayList<>();
        integers.add(0);
        integers.add(11);
        integers.add(222);

        List<Integer> asList = Arrays.asList(tab); // This is just a wrapper that makes the array avaliable as a list.
        List<Integer> of = List.of(tab);
        List<Integer> copyOf = List.copyOf(integers);

        tab[1] = 1_000_000;

        printListInfo(asList, "asList");

        printListInfo(of, "of");

        printListInfo(copyOf, "copyOf");

        System.out.println(Arrays.toString(tab));
    }

    public static void printListInfo(List<Integer> list, String name) {
        System.out.println(name);
        System.out.println(list);
        tryToAddElement(list);
        tryToRemoveElement(list);
        tryToReplace(list);
        System.out.println(list);
        System.out.println();
    }

    private static void tryToReplace(List<Integer> list) {
        try {
            list.set(0, 997);
        } catch (UnsupportedOperationException e) {
            System.out.println("Unsuported operation - .set()");
        }
    }

    private static void tryToRemoveElement(List<Integer> list) {
        try {
            list.remove(0);
        } catch (UnsupportedOperationException e) {
            System.out.println("Unsuported operation - .remove()");
        }
    }

    private static void tryToAddElement(List<Integer> list) {
        try {
            list.add(999);
        } catch (UnsupportedOperationException e) {
            System.out.println("Unsuported operation - .add()");
        }
    }
}
