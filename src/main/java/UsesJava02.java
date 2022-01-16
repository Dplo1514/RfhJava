import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class UsesJava02 {
    public static void main(String[] args) {
        DateTimeFormatter formatter = DateTimeFormatter.ofLocalizedTime(FormatStyle.SHORT);
        String shortFormat = formatter.format(LocalTime.now());
        System.out.println(shortFormat); //오후 5:37

        DateTimeFormatter myFormatter = DateTimeFormatter.ofPattern("yyyy년MM월dd일");
        String myDate = myFormatter.format(LocalDate.now());
        System.out.println(myDate);

        LocalDate today = LocalDate.now();
        LocalDate birthday = LocalDate.of(2021 , 03 , 04);
        Period period = Period.between(today , birthday);
        System.out.println(period.getMonths());
        System.out.println(period.getDays());

    }
}
