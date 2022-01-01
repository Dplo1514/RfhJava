import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.stream.Stream;

public class lamda {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("korea");
        list.add("japan");
        list.add("colombia");
        list.add("america");

        Stream<String> stream = list.stream();
        stream.map(str -> {
                    System.out.println(str);
                    return str.toUpperCase();
                }) //대문자로 바꿔줌 toUpperCase()
                .forEach(System.out::println);
    }

}
