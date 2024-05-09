import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class Main {
    public static void main(String[] args) {
        LocalDate end = LocalDate.now();
        LocalDate start = LocalDate.of(2024, 3, 25);
        System.out.println("相差的天数" + ChronoUnit.DAYS.between(start, end));
    }
}