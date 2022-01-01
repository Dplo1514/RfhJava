import org.apache.commons.lang3.tuple.Pair;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class streamQuiz {
    public static void main(String[] args) {
        //stream을 활용해서 이씨 성을 가진 사람들의 수를 세볼 것
        List<String> list = Arrays.asList("김정우", "김호정", "이하늘", "이정희", "박정우", "박지현", "정우석", "이지수");
        Stream<String> stringStream = list.stream().filter(s -> s.startsWith("이"));
        System.out.println(stringStream.count());
    }
}
