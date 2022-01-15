import java.util.Scanner;

public class ifElse02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int score = scanner.nextInt();
        
        if (score > 91 && score <= 100){
            System.out.println("Rank A");
        }else if (score > 81 && score <= 91){
            System.out.println("Rank B");
        }else if (score > 71 && score <= 81){
            System.out.println("Rank C");
        }else if (score > 61 && score <= 71){
            System.out.println("Rank B");
        }else {
            System.out.println("Rank F");
        }

    }
}
