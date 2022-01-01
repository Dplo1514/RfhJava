import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class timePkg {
    public static void main(String[] args) {
        System.out.println("now usages");
        LocalDate date = LocalDate.now();
        LocalTime time = LocalTime.now();
        LocalDateTime dateTime = LocalDateTime.now();
        System.out.println(date);
        System.out.println(time);
        System.out.println(dateTime);

        System.out.println("of() usages");
        LocalDate dateof = LocalDate.of(2022 , 01 ,01);
        System.out.println(dateof);
        LocalTime timeOf = LocalTime.of(15 , 30 , 30);
        System.out.println(timeOf);
    }
}
