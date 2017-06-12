import org.junit.Test;
import static java.util.Arrays.asList;

import java.util.Arrays;
import java.util.List;
import java.util.Collection;
import static org.junit.Assert.*;
import static java.util.stream.Collectors.toList;



/**
 * Created by ltregan on 6/9/17.
 */
public class StreamsCollection {


    @Test
    public void test(){
        Collection<Integer>   l = asList(1 ,2, 4);
        assertEquals(3, l.stream().count() );
        l.stream().map( e -> e*2 ).filter( e -> e ==4 ).forEach( e -> System.out.print( e ) );

    }

    @Test
    public void test2(){
        String s = "loic eeeest le plus gentil";
        Arrays.asList( s.getBytes() ).stream(  ).forEach( e -> System.out.print( "*"+e.getClass().getName() ) );
    }

    @Test
    public void test3(){
        byte[] b = new byte[] { 1, 2,3};
        Arrays.asList( b ).stream(  ).forEach( e -> System.out.print( "*"+e ) );

    }

}
