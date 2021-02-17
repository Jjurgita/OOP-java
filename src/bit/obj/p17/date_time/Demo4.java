package bit.obj.p17.date_time;

import java.time.LocalDate;
import java.time.temporal.WeekFields;
import java.util.Locale;

public class Demo4 {
    public static void main(String... args) {

        LocalDate date = LocalDate.parse("2021-02-17");
        System.out.println(date);

        date = LocalDate.of(2021, 02, 17);
        System.out.println(date);

        date = LocalDate.now();
        System.out.println(date);
        System.out.println("Year = " + date.getYear());
        System.out.println("Month = " + date.getMonth());
        System.out.println("MonthValue = " + date.getMonthValue());
        System.out.println("DayOfMonth = " + date.getDayOfMonth());
        System.out.println("DayOfWeek = " + date.getDayOfWeek());
        System.out.println("DayOfWeek value = " + date.getDayOfWeek().getValue());

        WeekFields weekFields = WeekFields.of(Locale.getDefault());
        int weekNumber = date.get(weekFields.weekOfWeekBasedYear());
        System.out.println("weekNumber = " + weekNumber);

        LocalDate date2 = date.plusDays(30);
        System.out.println(date2);

        LocalDate dateA = LocalDate.of(2018, 3, 31);
        LocalDate dateB = dateA.plusMonths(1);
        System.out.println(dateA + " +1men = " + dateB);
        LocalDate dateC = dateB.plusMonths(1);
        System.out.println(" +1men = " + dateC);
        LocalDate dateD = dateA.plusMonths(2);
        System.out.println(dateA + " +2men = " + dateD);

    }
}
