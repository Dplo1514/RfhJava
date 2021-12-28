public class forQuiz {
    public static void main(String[] args) {

        int sum = 0;
        for (int i = 0 ; i < 101 ; i++){
            sum += i;
        }
        System.out.println(sum);

        for (int i = 5; i > 0 ; i--){
            System.out.println("카운트 다운" + i);
        }

        int sumOdd = 0;
        int sumEven =0;

        for (int i = 0; i < 31; i++){
            int val = 1 + i;
            if (val % 2 == 0){
                sumOdd += val;
            }else {
                sumEven +=val;
            }
        }
        System.out.println("odd" + sumOdd);
        System.out.println("even" + sumEven);

    }
}
