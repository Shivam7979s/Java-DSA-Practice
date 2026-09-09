import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class DayOftheWeek {
    public static void main(String[] args) {
        int day = 17;
        int month = 7;
        int year = 1999;
        System.out.println(day(day , month, year));
    }
    static String day (int day, int month, int year) {
          LocalDate date1 = LocalDate.of(1971, 1, 1);
          LocalDate date2 = LocalDate.of(year, month, day);
        long gap = ChronoUnit.DAYS.between(date1, date2);
        String[] days = { "Friday", "Saturday", "Sunday", "Monday", "Tuesday", "Wednesday", "Thursday" };
        int i = ( int )(gap % 7);

        return days[i];
    }
}

/*
0 → Friday
1 → Saturday
2 → Sunday
3 → Monday
4 → Tuesday
5 → Wednesday
6 → Thursday

 */