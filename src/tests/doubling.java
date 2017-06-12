import org.junit.Test;
import static org.junit.Assert.*;
import java.util.*;
import java.util.Arrays;



/**
 * Created by ltregan on 5/12/17.
 */
public class doubling {

    List<Integer> doubling (List<Integer> in){

        in.replaceAll( n -> n*2);
        return in;
    }

    @Test
    public void test() {
        assertEquals( Arrays.asList( new int[]{2, 4, 6}) , doubling( Arrays.asList( new Integer[]{1, 2, 3} )) );
        assertEquals( Arrays.asList( new int[]{12, 16, 12, 16, -2}), doubling( Arrays.asList( new Integer[]{6, 8, 6, 8, -1}) ) );
        assertEquals( Arrays.asList( new int[]{}), doubling( Arrays.asList( new Integer[]{}) ) );
    };



}
