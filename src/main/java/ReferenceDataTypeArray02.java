import java.util.Arrays;

public class ReferenceDataTypeArray02 {
    public static void main(String[] args) {
        int[] intEmptyArray = new int[5]; //new int[5] : 아직 아무런 값을 할당하지 않은 5개의 파라미터 배열 생성 (0이 파라미터로 할당)
        System.out.println(Arrays.toString(intEmptyArray));

        int[] intArray = new int[]{1,2,3,4,5};
        System.out.println(Arrays.toString(intArray));

        String[] stringEmptyArray = new String[5]; //
        System.out.println(Arrays.toString(stringEmptyArray)); // new String[5] : 아직 아무런 값을 할당하지 않은 5개의 파라미터 배열 생성 (null이 파라미터로 할당)

        String[] season = new String[] {"봄" , "여름" , "가을" , "겨울"}; //String[] : String type 의 데이터를 파라미터로 갖는 배열 생성
        System.out.println(Arrays.toString(season));

        System.out.println(season.length); //.length : 배열의 길이를 리턴해주는 변수
        System.out.println(season[season.length - 1]); // season 배열의 마지막 파라미터 값 인덱스

    }
}
