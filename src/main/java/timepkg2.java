import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.Date;

public class timepkg2 {
    public static void main(String[] args) {
        DateTimeFormatter formatter = DateTimeFormatter.ofLocalizedTime(FormatStyle.SHORT);
        String shortFormat = formatter.format(LocalTime.now());
        System.out.println(shortFormat);

        DateTimeFormatter myFormatter = DateTimeFormatter.ofPattern("yyyy년MM월dd일");
        String myDate = myFormatter.format(LocalDate.now());
        System.out.println(myDate);
    }
}
