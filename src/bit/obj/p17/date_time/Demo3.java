package bit.obj.p17.date_time;

import java.util.Date;
import java.util.TimeZone;

public class Demo3 {
    public static void main(String... args) {

        TimeZone timeZone = TimeZone.getDefault();
        System.out.println(timeZone.getDisplayName());
        System.out.println("RawOffset (from GMT) in ms = " + timeZone.getRawOffset());
        System.out.println("inDaylightTime? " + timeZone.inDaylightTime(new Date()));
        System.out.println("DaylightTime? " + timeZone.useDaylightTime());
        System.out.println("DSTSavings = " + timeZone.getDSTSavings());
        System.out.println("ID = " + timeZone.getID());

        timeZone = TimeZone.getTimeZone("America/Los_Angeles");
        System.out.println(timeZone.getDisplayName());
        System.out.println("RawOffset (from GMT) in ms = " + timeZone.getRawOffset());
        System.out.println("inDaylightTime? " + timeZone.inDaylightTime(new Date()));
        System.out.println("DaylightTime? " + timeZone.useDaylightTime());
        System.out.println("DSTSavings = " + timeZone.getDSTSavings());
        System.out.println("ID = " + timeZone.getID());

    }
}
