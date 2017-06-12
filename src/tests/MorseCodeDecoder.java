
import org.junit.Test;

import java.util.regex.Matcher;
import java.util.*;
import java.util.regex.Pattern;
import java.util.stream.*;
import static java.util.Arrays.stream;
import static java.util.stream.Collectors.joining;
import java.util.*;



/**
 * Created by ltregan on 5/16/17.
 */
public class MorseCodeDecoder {




    public static String decodeS(String morseCode) {

        return Arrays.stream(  morseCode.split("x")).collect( joining(".") );
    }



    @Test
    public void test9(){
        System.out.println( decodeS("ABCDxEFGxAAA") );
    }
}
