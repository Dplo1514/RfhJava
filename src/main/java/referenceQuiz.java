import java.util.Arrays;
import java.util.SortedMap;

public class referenceQuiz {
    public static void main(String[] args) {
        char s = 's';
        int i = 10;

        System.out.println(s);
        System.out.println(i);
        System.out.println(s + i); //s의 ASCII값 + int
        System.out.println(s+ "" + i); //Str s + int

        int[] numArray = new int[] {10 , 20 , 30};

        System.out.println(Arrays.toString(numArray));
        System.out.println(numArray[numArray.length -1]);
    }
}