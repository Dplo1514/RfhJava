import java.util.ArrayList;
import java.util.Arrays;

public class reference {
    public static void main(String[] args) {
        String str = "String";
        System.out.println(str);

        int[] intArray = new int[]{1,2,3,4,5}; //int 배열 선언 초기화
        System.out.println(Arrays.toString(intArray));

        int[] intEmptyArray = new int[5]; //빈 int 배열 선언
        System.out.println(Arrays.toString(intEmptyArray));

        String[] stringEmptyArray = new String[5]; //빈 str 배열 선언
        System.out.println(Arrays.toString(stringEmptyArray));

        String[] season = {"봄" , "여름" , "가을" , "겨울"};//str 배열 선언 초기화
        System.out.println(Arrays.toString(season));

        System.out.println(season[season.length -1]);
    }
}
