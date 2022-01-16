import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class UsesJava01 {
    public static void main(String[] args) {
        System.out.println("now usages");
        LocalDate date = LocalDate.now();
        LocalTime time = LocalTime.now();
        LocalDateTime dateTime = LocalDateTime.now();

        System.out.println(date);
        System.out.println(time);
        System.out.println(dateTime);

        System.out.println("of() usage");
        LocalDate dateOf = LocalDate.of(2020 , 10 , 14);
        LocalTime timeOf = LocalTime.of(10 , 10);

        System.out.println(dateOf);
        System.out.println(timeOf);
    }
}
