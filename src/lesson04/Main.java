package lesson04;


import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        Set<Integer> set = new TreeSet<>((o1, o2) -> o1 - o2);
        set.add(5);
        set.add(15);
        set.add(3);
        System.out.println("test2" + "test");
    }
}
