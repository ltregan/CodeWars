import org.junit.Test;
import utils.Arrays;

import static org.junit.Assert.*;
import java.util.*;
import static utils.Arrays.to;

/**
 * Created by ltregan on 5/15/17.
 */
public class square {

    public List<Integer> square(List<Integer> nums) {
        nums.replaceAll( n -> n*n );
        return nums;
    }

    @Test
    public void test(){
        assertEquals( to(1, 4, 9),  square( Arrays.to(1, 2, 3) ) );
        assertEquals( to(36, 64, 36, 64, 1),  square( to(6, 8, -6, -8, 1) ) );
        assertEquals( to(),  square( to() ) );
    }

}
