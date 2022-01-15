public class LoopQuiz02 {
    public static void main(String[] args) {
        System.out.println("1부터 30까지 홀수의 합 , 짝수의 합을 각각 출력하는 반복문 만들기");
        int odd = 0;
        int even = 0;

        for (int i=0; i<=30 ; i++){

            if (i % 2 == 0){
                odd += i;
            }else {
                even += i;
            }
        }
        System.out.println("홀수 : " + even);
        System.out.println("짝수 : " + odd);
    }
}
