import java.util.Arrays;

public class ReferenceDataTypeArray01 {
    public static void main(String[] args) {
        //참조자료형

        int[] intArray = new int[] {1,2,3,4,5}; //int[] : int타입 배열 선언 , 기본자료형이 아닌 참조자료형
                                                //new int[] : int배열을 만들며 {}안의 값들로 초기화함
                                                //배열이란?? : 동일한데 자료형의 데이터를 여러개 담을 수 있는 참조자료형
        System.out.println(Arrays.toString(intArray));
    }
}
