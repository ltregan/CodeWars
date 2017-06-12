import org.junit.Test;
import static org.junit.Assert.*;
/**
 * Created by ltregan on 5/15/17.
 */
public class splitArray {

    boolean splitArray( int nums[], int i, int s1, int s2){
        if( i == nums.length ){
            return s1 == s2;
        }
        return splitArray(nums, i+1, s1 + nums[i], s2) || splitArray(nums, i+1, s1 , s2 + nums[i])  ;

    }


    boolean splitArray(int nums[]){
        return splitArray( nums, 0, 0, 0);
    }

    @Test
    public void test(){
        assertEquals( true, splitArray( new int[]{2,2} ) );
        assertEquals( false, splitArray( new int[]{2,3} ) );
        assertEquals( true, splitArray( new int[]{5,2,3} ) );

    }
}
