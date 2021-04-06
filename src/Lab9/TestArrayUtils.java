package Lab9;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestArrayUtils {
    @Test
    public void testMaxInArr() {
        int [] a = {23, 5, 6, 9 ,200};
        int max = ArrayUtils.maximum(a);
        assertEquals(200, max);
    } 

    @Test
    public void testAscending() {
        int[] a = {4, 6, 9, 2};
        boolean test = ArrayUtils.isAscending(a);
        assertEquals(false, test);
    }
}