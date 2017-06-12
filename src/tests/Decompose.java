import static java.lang.Math.*;
import static org.junit.Assert.*;
import org.junit.Test;
import java.util.*;
import static java.util.stream.Collectors.*;

/**
 * Created by ltregan on 5/17/17.
 */
public class Decompose {

    public boolean decompose(long n, long balance, List<Long> result) {
        if( balance == 0)
            return true; // spot-on
        if( balance < 0)
            return false; // we went too far, backtrack
        while (n > 0) {
            if (decompose(n - 1, balance - n*n, result)) {
                result.add( n);
                return true;
            }
            n--;
        }
        return false;
    }


    public String decompose(long n) {
        List<Long> result = new LinkedList();
        decompose( n-1, n*n, result );
        return result.stream().map(x  -> x.toString() ).collect( joining( " "  ) );
    }

    @Test
    public void test1() {
        Decompose d = new Decompose();
//        assertEquals("1",  d.decompose(1));
//        assertEquals("4",  d.decompose(4));
//        assertEquals("4 5",  d.decompose(5));
        assertEquals("1 2 4 10",  d.decompose(11));
    }



}
