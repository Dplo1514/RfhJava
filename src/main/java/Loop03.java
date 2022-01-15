public class Loop03 {
    public static void main(String[] args) {
        //while() : 괄호 안의 조건이 true이면 항상 중괄호안의 블럭이 실행됨
        int i = 0;
        int sum =0;

        while (i <10){
            sum += i + 1;
            i++;
            if (i == 8){
                break;
            }
        }
        System.out.println(sum);
    }
}
