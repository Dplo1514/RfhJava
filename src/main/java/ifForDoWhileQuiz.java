import java.util.Scanner;

public class ifForDoWhileQuiz {
    public static void main(String[] args) {
        while (true) {
            Scanner sc = new Scanner(System.in);
            int score = sc.nextInt();

            if (score < 100 && score >= 91) {
                System.out.println("A등급 입니다.");
            } else if (score < 91 && score >= 81) {
                System.out.println("B등급 입니다.");
            } else if (score < 81 && score >= 71)
                System.out.println("C등급 입니다.");
            else if (score < 71 && score >= 61) {
                System.out.println("D등급 입니다.");
            }else if(score < 61) {
                break;
            }
        }
    }
}
