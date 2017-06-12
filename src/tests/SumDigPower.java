
import java.util.*;
import static java.lang.Math.*;
import org.junit.*;
import static org.junit.Assert.*;

public class SumDigPower {


        public void x( int y[]){
            for( int i: y){

            }
        }

    public static boolean isDigPow( long x){
        long in  = x;
        List<Long> decomp = new ArrayList<Long>();
        while( x >0 ){
            decomp.add( x % 10 );
            x /= 10;
        }
        int sum =0;
        for( int i = 0; i<  decomp.size(); i++ ){
            sum += pow( decomp.get(i), decomp.size() -i  );
        }
        return sum == in;
    }

    public static List<Long> sumDigPow(long a, long b) {
        List<Long> result = new ArrayList<Long>();
        for( long i =a; i <=b; i++){
            if( isDigPow(i) )
                result.add( i );
        }
        return result;
    }



    private static void testing(long a, long b, long[] res) {
        assertEquals( Arrays.toString(res), Arrays.toString( sumDigPow(a, b).toArray()));
    }


    @Test
    public void test() {
        testing(1, 1, new long[] {1});
        testing(1, 10, new long[] {1, 2, 3, 4, 5, 6, 7, 8, 9});
        testing(1, 100, new long[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 89});
        testing(10, 100,  new long[] {89});
        testing(90, 100, new long[] {});
        testing(90, 150, new long[] {135});
        testing(50, 150, new long[] {89, 135});
        testing(10, 150, new long[] {89, 135});
    }

}
