import org.apache.commons.lang3.tuple.Pair;

import java.util.*;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamQuiz {
    public static void main(String[] args) {
        //'이'씨 성을 가진 사람들의 수를 세볼려고 합니다. 스트림을 활용해서 코드를 만들어보세요!

        List<String> names = Arrays.asList("김정우", "김호정", "이하늘", "이정희", "박정우", "박지현", "정우석", "이지수");

        long count = names.stream()
                .filter(str -> str.startsWith("이"))
                .count();
        System.out.println(count);
    }
}
