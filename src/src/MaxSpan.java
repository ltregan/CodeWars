import java.util.*;

/**
 * Created by ltregan on 4/4/17.
 */
public class MaxSpan {

    public int maxSpan(int[] nums) {
        int result =0;
        for( int i=0; i< nums.length; i++){
            int a = nums[i];
            for( int j=i; j< nums.length; j++){
                if( nums[j] == a && j-i >=result)
                    result = j-i+1;
            }
        }
        return result;
    }

    public int maxSpan2(int[] nums) {
        if( nums == null)
            throw new IllegalArgumentException("nums==null");

        int result =0;
        Map< Integer, Integer> first = new HashMap();

        for( int i=-0; i<nums.length; i++){
            int x = nums[i];
            Integer f = first.get(x);
            if( f == null){
                first.put( x, i);
            }else{
                int span = i - f+1;
                if( span > result)
                    result = span;
            }
        }

        return result;
    }


}
