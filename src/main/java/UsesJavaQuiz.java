import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class UsesJavaQuiz {
    public static void main(String[] args) {
        //오늘의 날짜를 년도 / 월 / 일  시간 / 일자의 형식으로 값을 출력
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy/MM/dd");
        String nowDate = dateTimeFormatter.format(LocalDate.now());
        System.out.println(nowDate);

        DateTimeFormatter timeFormatter = DateTimeFormatter.ofPattern("hh시mm분");
        String nowTime = timeFormatter.format(LocalTime.now());
        System.out.println(nowTime);

        DateTimeFormatter dayFormatter = DateTimeFormatter.ofPattern("MM월 dd일 EEEE");
        String nowWeekDay = dayFormatter.format(LocalDate.now());
        System.out.println(nowWeekDay);

        System.out.println(nowDate + " " + nowTime + "/" +nowWeekDay);


    }
}
