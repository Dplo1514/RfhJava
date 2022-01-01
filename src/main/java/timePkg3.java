import java.time.LocalDate;
import java.time.Period;

public class timePkg3 {
    public static void main(String[] args) {
        LocalDate today = LocalDate.now();
        LocalDate birthDay = LocalDate.of(2022,03,04);
        Period period = Period.between(today , birthDay);
        System.out.println(period.getMonths());
        System.out.println(period.getDays());
    }
}

