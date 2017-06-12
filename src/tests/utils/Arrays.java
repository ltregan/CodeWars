package utils;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by ltregan on 5/15/17.
 */
public class Arrays {

    public static List<Integer> to(int... values){
        System.out.println( values.getClass().getName() );


        List<Integer> result = new ArrayList<Integer>();
        for( int i: values){
            result.add( i );
        }
        return result;
    }

}
