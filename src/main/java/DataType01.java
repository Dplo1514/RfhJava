public class DataType01 {
    public static void main(String[] args) {
        //숫자형 데이터 타입
        short s = 1; // 2byte로 표현할 수 있는 데이터 타입
        int i = 3; // 4byte로 표현할 수 있는 데이터 타입
        long l = 15; // 8byte로 표현할 수 있는 데이터 타입
        float f = 15.4F; //실수를 표현할 수 있는 데이터 타입 (CastFloat : 변수 값 선언 후 대문자 F를 붙혀줘야 실수형 데이터의 선언이 가능)
        double d = 5.5; // 실수를 표현할 수 있는 데이터 타입 (float보다 더 큰 실수의 선언가능 , castFloat이 불필요)

        System.out.println(Short.MAX_VALUE + "" + Short.MIN_VALUE); //short의 최대 값 , 최소 값 확인
        System.out.println(Integer.MAX_VALUE + "" + Integer.MIN_VALUE); //Int의 최대 값 , 최소 값 확인
        System.out.println(Long.MAX_VALUE + "" + Long.MIN_VALUE); //long의 최대 값 , 최소 값 확인
        System.out.println(Float.MAX_VALUE + "" + Float.MIN_VALUE); //float의 최대 값 , 최소 값 확인
        System.out.println(Double.MAX_VALUE + "" + Double.MIN_VALUE); //double의 최대 값 , 최소 값 확인
    }
}
