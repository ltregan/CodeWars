import org.junit.Test;
import static org.junit.Assert.*;
import java.util.*;

/**
 * Created by ltregan on 5/15/17.
 */
public class splitOdd10 {


    public boolean split( int[] num, int i, int s1, int s2){
        if( i >= num.length){
            return s1 % 10 == 0 && s2 % 2 ==1;
        }
        return      split( num, i+1, s1 + num[i], s2)
                ||
                    split( num, i+1, s1, s2+num[i]);

    }

    public boolean splitOdd10(int[] nums) {

        List<Integer> g1 = new ArrayList<Integer>();
        List<Integer> g2 = new ArrayList<Integer>();

        return split( nums, 0, 0,0);

    }

    @Test
    public void test(){
        assertEquals( true, splitOdd10( new int[]{10,1} ));
        assertEquals( false, splitOdd10( new int[]{2,10} ));


        assertEquals( true, splitOdd10( new int[]{5,5,5} ));
        assertEquals( false, splitOdd10( new int[]{5,5,6} ));
        assertEquals( true, splitOdd10( new int[]{5,5,6,1} ));
    }


}
