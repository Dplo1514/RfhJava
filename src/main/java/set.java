import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class set {
    public static void main(String[] args) {
        Set<Integer> integerSet = new HashSet<>();
        integerSet.add(1);
        integerSet.add(1);
        integerSet.add(3);
        integerSet.add(2);
        integerSet.add(9);
        integerSet.add(8);

        Set<String> stringSet = new HashSet<>();
        stringSet.add("LA");
        stringSet.add("Newyork");
        stringSet.add("Lasvegas");
        stringSet.add("San fransisco");
        stringSet.add("Seoul");

        System.out.println(integerSet);
        System.out.println(stringSet);

        stringSet.remove("Seoul");
        System.out.println(stringSet);

        List<String> target = new ArrayList<>();
        target.add("Newyork");
        target.add("Lasvegas");

        stringSet.removeAll(target);
        System.out.println(stringSet);

        System.out.println("LA 포함되어있나요?" + stringSet.contains("LA"));
        System.out.println("Seoul 포함되어있나요?" + stringSet.contains("Seoul"));

        System.out.println(stringSet.size());
        stringSet.clear();
        System.out.println(stringSet);

    }
}
