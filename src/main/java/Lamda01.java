import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.stream.Stream;

public class Lamda01 {
    public static void main(String[] args) {
        List<String> stringList = new ArrayList<>();
        stringList.add("korea");
        stringList.add("japan");
        stringList.add("france");
        stringList.add("china");

        Stream<String> stream = stringList.stream();
        stream.map(str -> { //Lamda식
            System.out.println(str);
            return str.toUpperCase();
        }).forEach(System.out::println);

        System.out.println(stringList);
    }
}
