package Collection;

import java.util.LinkedHashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        TooSets m1 = new TooSets();
        Set<String> ss1 = new LinkedHashSet<>();
        ss1.add("a");
        ss1.add("b");
        ss1.add("c");
        m1.setSet1(ss1);
        ss1 = new LinkedHashSet<>();
        ss1.add("d");
        ss1.add("a");
        ss1.add("e");
        m1.setSet2(ss1);

        System.out.println(m1.union());
        System.out.println(m1.intersect());
        System.out.println(m1.getSet1());
    }
}
