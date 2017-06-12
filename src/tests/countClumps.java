import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Created by ltregan on 5/12/17.
 */
public class countClumps {

    public int countClumps(int[] nums) {
        int result =0;
        boolean matching = false;
        for( int n=1; n < nums.length; n++){
            if( nums[n] == nums[n-1]  ) {
                matching = true;
            } else if(  matching) {
                result++;
                matching = false;
            }
        }
        if( matching )
            result++;
        return result;
    }


    @Test
    public void test(){
        assertEquals( 2, countClumps(new int[] {1, 2, 2, 3, 4, 4}));
        assertEquals( 2, countClumps(new int[] {1, 1, 2, 1, 1}));
        assertEquals( 1, countClumps(new int[] {1, 1, 1, 1, 1}));



    }
}
