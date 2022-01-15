public class LoopQuiz01 {
    public static void main(String[] args) {
        System.out.println("1번 : 1부터 100까지 더하기");
        int sum = 0;
        for (int i = 0 ; i < 100 ; i++){
            sum += i+1;
        }
        System.out.println(sum);

        System.out.println("2번 : 5초부터 카운트다운 만들기");
        for (int i = 5 ; i >= 0  ; i--){
            System.out.println("카운트다운 :" + i);
        }


    }
}
