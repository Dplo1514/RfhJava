import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.time.format.TextStyle;
import java.util.Date;
import java.util.Locale;

public class timePkgQuiz {
    public static void main(String[] args) {
        //오늘 날짜를 연월일 시간 일자 출력
        System.out.println("오늘 날짜를 연 월 일 시간 일자출력");
        LocalDate date = LocalDate.now();
        LocalTime time = LocalTime.now();
        DayOfWeek week =  date.getDayOfWeek();
        String myWeek = week.getDisplayName(TextStyle.FULL , Locale.KOREAN);
        System.out.println(date);
        System.out.println(time);
        System.out.println(week);

        //년 / 월 / 일 시간 / 일자 /
        System.out.println("--------------");
        System.out.println("\n");
        DateTimeFormatter myFormatter = DateTimeFormatter.ofPattern("yyyy/MM/dd");
        String myDate = myFormatter.format(LocalDate.now());

        DateTimeFormatter myTimeFormatter = DateTimeFormatter.ofLocalizedTime(FormatStyle.SHORT);
        String myTime = myTimeFormatter.format(LocalTime.now());

        DateTimeFormatter myDateTime = DateTimeFormatter.ofPattern("yyyy년MM월dd일");
        String dateTime = myDateTime.format(LocalDate.now());
        System.out.println(myDate + " " + myTime + " " + myWeek + " " + dateTime);
    }
}
