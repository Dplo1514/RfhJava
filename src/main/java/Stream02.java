import java.util.Arrays;
import java.util.stream.Stream;



public class Stream02 {
    public static void main(String[] args) {
        String[] arr = {"sql" , "java" , "python"};
        Stream<String> stringStream = Arrays.stream(arr);
        stringStream.forEach(System.out::println);

        }
    }
