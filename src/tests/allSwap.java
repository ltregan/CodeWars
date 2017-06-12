import org.junit.Test;
import static org.junit.Assert.*;
import java.util.Map;
import java.util.HashMap;

/**
 * Created by ltregan on 5/12/17.
 */
public class allSwap {

    public String[] allSwap(String[] strings) {
        String result[] = new String[strings.length];
        Map<Character, Integer> map = new HashMap<Character, Integer>();
        for( int i = 0; i <  strings.length; i++){
            String s = strings[i];
            if( s.length() ==0){
                result[i] = "";
                continue;
            }
            char key = s.charAt(0);
            Integer pos = map.get(key);
            if( pos == null){ // it is a new string
                map.put( key, i);
                result[i] = s;
            }else{ // if there has been a string with the same first char
                String temp = result[pos];
                result[pos] = s;
                result[i] = temp;
                map.remove(key);
            }
        }
        return result;
    }

    @Test
    public void test(){
        assertArrayEquals( new String[] {"ac", ""}, allSwap(new String[] {"ac", ""} ));
        assertArrayEquals( new String[] {"ac", "ab"}, allSwap(new String[] {"ab", "ac"} ));
        assertArrayEquals( new String[] {"ay", "by", "cy", "cx", "bx", "ax", "azz", "aaa"},
                            allSwap( new String[] {"ax", "bx", "cx", "cy", "by", "ay", "aaa", "azz"}) );

        assertArrayEquals( new String[] {"ay", "by", "ax", "bx", "aj", "ai", "by", "bx"},
                allSwap( new String[] {"ax", "bx", "ay", "by", "ai", "aj", "bx", "by"}) );




    }

}
