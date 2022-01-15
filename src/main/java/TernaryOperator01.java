public class TernaryOperator01 {
    public static void main(String[] args) {
        //삼항연산자 (조건) ? : 괄호안의 조건이 true이면 "" : "" 왼쪽 값을 실행 , false이면 오른쪽 값을 실행
        int a = 5;
        String result = (a <= 10) ? "A는 10보다 작습니다" : "A는 10보다 큽니다.";
        System.out.println(result);
    }
}
