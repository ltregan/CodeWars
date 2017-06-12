

import org.junit.Test;
import static org.junit.Assert.*;



/**
 * Created by ltregan on 5/12/17.
 */
public class doubleChar {

    public String doubleChar(String str) {
        StringBuffer result = new StringBuffer();
        for( char c: str.toCharArray()){
            result.append(c);
            result.append(c);
        }
        return result.toString();
    }


    @Test
    public void test() {
        assertEquals( "TThhee", doubleChar("The"));
        assertEquals( "AAAAbbbb", doubleChar("AAbb") );
        assertEquals( "HHii--TThheerree", doubleChar("Hi-There")  );
    }
}

