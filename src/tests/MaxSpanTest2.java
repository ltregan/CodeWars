

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by ltregan on 4/5/17.
 */
public class MaxSpanTest2 {

    @Test
    public void testMe(){
        MaxSpan s = new MaxSpan();
        assertEquals( 3, s.maxSpan( new int[]{0,1,0} ));
        assertEquals( 0, s.maxSpan( new int[0]));

        assertEquals( 3, s.maxSpan2( new int[]{0,1,0} ));
        assertEquals( 0, s.maxSpan2( new int[0]));
    }

}



