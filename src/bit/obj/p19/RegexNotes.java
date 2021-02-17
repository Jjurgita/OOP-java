package bit.obj.p19;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
/*
            Visi String metodai, kurie naudoja reguliaras išraiškas, viduje naudoja Pattern ir Matcher klases ir jų metodus

            Pattern p = Pattern.compile("a*b");
            Matcher m = p.matcher(“aaaaab");
 */
public class RegexNotes {
    public static void main(String... args) {

        Pattern pattern = Pattern.compile("a*b");
        Matcher matcher = pattern.matcher("aaaaaab");
        boolean b = matcher.matches();

        System.out.println("a*b ? aaaaab: " +  b);

        String text = "alus baltas baltas\nsniegas baltas ir šaltas";
        System.out.println(text);

        // a.{3}s
        String reg = "a(.{3})s";
        System.out.println("reg: " + reg);
        pattern = Pattern.compile(reg);
        matcher = pattern.matcher(text);

        while (matcher.find()) {
            // Get the matching string
            String match = matcher.group();
            System.out.println(match + ", 3: " + matcher.group(1));
        }

        // a.*s
        reg = "a.*s";
        System.out.println("reg: " + reg);
        pattern = Pattern.compile("a.*s");
        matcher = pattern.matcher(text);

        // Find all matches
        while (matcher.find()) {
            // Get the matching string
            String match = matcher.group();
            System.out.println(match);
        }

        // a.*s Pattern.DOTALL
        reg = "a.*s";
        System.out.println("reg: " + reg);
        pattern = Pattern.compile("a.*s", Pattern.DOTALL);
        matcher = pattern.matcher(text);

        // Find all matches
        while (matcher.find()) {
            // Get the matching string
            String match = matcher.group();
            System.out.println(match);
        }
    }
}
