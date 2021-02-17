package bit.obj.p17.date_time;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class Demo7 {
    public static void main(String... args) throws ParseException {

        DateFormat dateFormat = new SimpleDateFormat("M/d 'of' yyyy");
        Date date = dateFormat.parse("1/15 of 2020");
        System.out.println(date);

        Locale locale = new Locale("lt");
        dateFormat = new SimpleDateFormat("yyyy LLLL 'mėn.' d 'd.'", locale);
        System.out.println(dateFormat.format(date));
        dateFormat = new SimpleDateFormat("yyyy MMMM 'mėn.' d 'd.'", locale);
        System.out.println(dateFormat.format(date));

    }
}
