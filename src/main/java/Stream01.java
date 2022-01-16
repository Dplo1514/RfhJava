import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Stream01 {
    public static void main(String[] args) {
        //스트림 : 데이터의 흐름
        List<String> stringList = new ArrayList<>();
        stringList.add("서울");
        stringList.add("부산");
        stringList.add("대구");
        stringList.add("울산");
        stringList.add("대전");
        System.out.println(stringList);

        List<String> result = stringList.stream()
                .limit(2)
                .collect(Collectors.toList());
        System.out.println(result);

        System.out.println("list -> treansformation -> set");
        Set<String> set = stringList.stream()
                .filter("서울"::equals)
                .collect(Collectors.toSet());
        System.out.println(set);
    }
}
