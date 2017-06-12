import java.io.Console;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by ltregan on 6/12/17.
 */
public class PatternTest {


    public static void main(String[] args) {



        final String PATTERN = "^[0-9]";
        final String INPUT = "1";

        String ss =  Pattern.compile("^[0-9]").matcher("1").replaceAll("X");
        System.out.println(ss);
    }
}



