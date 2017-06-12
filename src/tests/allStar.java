
import org.junit.Test;
import static org.junit.Assert.*;


/**
 * Created by ltregan on 5/12/17.
 */
public class allStar {


    public String allStar(String str) {
        if( str.length() ==1 || str.length() ==0)
            return str;
        return str.charAt(0) +"*" + allStar( str.substring(1) );
    }

    @Test
    public void test(){
        assertEquals( "h*e*l*l*o", allStar("hello"));
        assertEquals( "a*b*c", allStar("abc"));
        assertEquals( "a*b", allStar("ab"));
    }


}
