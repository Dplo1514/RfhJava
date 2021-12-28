public class ifForDo {
    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 20;

        if (num1 < num2) {
            System.out.println("num2 win");
        } else if (num1 > num2) {
            System.out.println("num1 win");
        }

        char score = 'c';
        switch (score){
            case 'c':
                System.out.println("c등급");
                break;
            case 'a':
                System.out.println("a등급");
                break;
            default:
                System.out.println("none score");
        }

        int a = 5;
        String result = (a < 10)?  "10보다 작습니다" : "10보다 큽니다"; //삼항연산자 조건 값이 true이면 앞 조건 , false이면 후 조건
        System.out.println(result);
    }
}