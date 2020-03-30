package mainPackage.core21.lesson.task2;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Date date = new Date();
        LocalDate ld = convertToLocalDate(date);
        System.out.println(ld);
        LocalTime lt = convertToLocalTime(date);
        System.out.println(lt);
        LocalDateTime ldt = convertToLocalDateTime(date);
        System.out.println(ldt);

    }

    private static LocalDate convertToLocalDate(Date date) {
        return date.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
    }

    private static LocalTime convertToLocalTime(Date date) {
        return date.toInstant().atZone(ZoneId.systemDefault()).toLocalTime();
    }

    private static LocalDateTime convertToLocalDateTime(Date date) {
        return date.toInstant().atZone(ZoneId.systemDefault()).toLocalDateTime();
    }
}
