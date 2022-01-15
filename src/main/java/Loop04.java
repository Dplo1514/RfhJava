public class Loop04 {
    public static void main(String[] args) {
        //do {} : 중괄호 안의 블럭을 실행 , while() : 괄호안의 조건이 true이면 do블럭을 반복실행
        int i = 0;
        int sum = 0;

        do {
            sum += i;
            i++;
        }while (i < 10);{
            System.out.println(sum);
        }
    }
}
