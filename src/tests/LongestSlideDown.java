
import org.junit.Test;

import java.util.Arrays;
import java.util.stream.IntStream;

import static org.junit.Assert.*;
import static java.lang.Math.*;


public class LongestSlideDown {


    public static int longestSlideDownx(int[][] pyramid) {
        IntStream
                .iterate(pyramid.length - 2, i -> i - 1)
                .limit(pyramid.length - 1)
                .forEach(i -> IntStream
                        .rangeClosed(0, i)
                        .forEach(j ->
                                pyramid[i][j] += Math.max(pyramid[i+1][j], pyramid[i+1][j+1])));
        return pyramid[0][0];
    }

    public static int longestSlideDown(int[][] pyramid, int row, int dyn[][]) {
        if( row <0)
            return dyn[0][0];
        dyn[row] = new int[pyramid[row].length];
        for( int i=0; i<  pyramid[row].length; i++){
            dyn[ row ][i] = pyramid[row][i] + max( dyn[row+1][i], dyn[row+1][i+1] );
        }
        return longestSlideDown( pyramid, row-1, dyn);
    }

    public static int longestSlideDown(int[][] pyramid) {
        int dyn[][] = new int[pyramid.length][];
        dyn[pyramid.length-1] = pyramid[pyramid.length-1].clone();
        return longestSlideDown(pyramid, dyn.length-2, dyn);
    }

    @Test
    public void test() {
        int[][] test = new int[][]{{1}};
        assertEquals(1, longestSlideDown(test));
        test = new int[][]{{1}, {1, 2}};
        assertEquals(3, longestSlideDown(test));
        test = new int[][]{{1}, {2, 1}, {2,3,10}};
        assertEquals(12, longestSlideDown(test));
    }
}