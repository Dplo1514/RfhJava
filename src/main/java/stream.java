import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class stream {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("seoul");
        list.add("busan");
        list.add("ulsan");
        list.add("seoul");

        System.out.println(list);
        List<String> result = list.stream()
                .limit(2)
                .collect(Collectors.toList());
        System.out.println(result);

        System.out.println("list -> tranformation -> set");
        Set<String> set = list.stream().
                filter("seoul"::equals)
                .collect(Collectors.toSet());
        System.out.println(set);
    }
}
