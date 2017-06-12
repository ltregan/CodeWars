import org.junit.Test;

import java.util.Arrays;
import java.util.regex.Pattern;
import java.util.stream.IntStream;
import java.util.stream.Stream;
import java.util.List;

import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;
import static org.junit.Assert.*;


/**
 * Created by ltregan on 6/8/17.
 */
public class Soundex {


    public String soundex(String s) {
        if( s == null || s.length() == 0 )
            return s;
        return Pattern.compile("\\s+").splitAsStream(s).map( w -> soundexWord(w) ).collect( joining(" " ) );
    }

    public String soundexWord(String s) {

        char first = s.charAt(0);
        s = s.toUpperCase();
        s = s.charAt(0)+s.substring(1).replaceAll("[HW]","");
        s = s.replaceAll("[BFPV]","1")
                .replaceAll("[CGJKQSXZ]", "2")
                .replaceAll("[DT]","3")
                .replaceAll("[L]", "4")
                .replaceAll("[MN]", "5")
                .replaceAll("[R]", "6");
        s = s.replaceAll("(.)\\1+", "$1");
        s = s.charAt(0)+s.substring(1).replaceAll("[AEIOUY]", "");
        s = Pattern.compile("^\\d").matcher(s).replaceAll(""+first);
        s += "000";
        s = s.substring(0,4);

        return s.toString();
    }

    @Test
    public void test1(){


    // empty args
        assertEquals( null, soundex(null) );
        assertEquals( "", soundex("") );


    // remove all H, W except first letter
        assertEquals( "H000", soundex("HHHHHWWW") );
        assertEquals( "M600", soundex("MWHR") );

    // remove duplicate digits
        assertEquals( "B000", soundex("B") );
        assertEquals( "B000", soundex("BBB") );
        assertEquals( "B200", soundex("BCC") );

    // remove syllables except first letter
        assertEquals( "A000", soundex("AEIOUY") );


    // samples
        assertEquals( "S600", soundex("Sarah") );
        assertEquals( "C560", soundex("Connor") );
        assertEquals( "S600 C560", soundex("Sarah Connor") );

    }

}
