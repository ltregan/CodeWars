
import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Created by ltregan on 5/12/17.
 */
public class countHi {

    public int countHi(String str) {
        int result =0;
        for( int i=0; i < str.length()-1; i++){
            if( str.charAt(i) == 'h' && str.charAt(i+1) == 'i')
                result++;
        }
        return result;
    }


    @Test
    public void test(){
        assertEquals(0, countHi(""));
        assertEquals(0, countHi("h"));
        assertEquals(1, countHi("abc hi ho"));
        assertEquals( 2, countHi("ABChi hi"));
        assertEquals( 2, countHi("hihi"));
    }

}
