package bit.obj.p17.date_time;

import java.time.LocalDateTime;

public class Demo5 {
    public static void main(String... args) {

        LocalDateTime dateTime = LocalDateTime.parse("2021-02-17T15:03:59.999");
        System.out.println(dateTime);

        dateTime = LocalDateTime.of(2021, 02, 17, 15, 03, 0, 12345678);
        System.out.println(dateTime);

        dateTime = LocalDateTime.now();
        System.out.println(dateTime);

        dateTime = dateTime.plusDays(10);
        System.out.println(dateTime);

        dateTime = dateTime.plusYears(1);
        System.out.println(dateTime);

        dateTime = dateTime.plusSeconds(3600);
        System.out.println(dateTime);
    }
}
