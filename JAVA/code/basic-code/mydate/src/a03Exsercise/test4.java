package a03Exsercise;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class test4 {
    public static void main(String[] args) {
        LocalDate today = LocalDate.now();
        LocalDate birthDate = LocalDate.of(2003, 3, 24);
        long day = ChronoUnit.DAYS.between(birthDate, today);
        System.out.println(day);
    }
}
