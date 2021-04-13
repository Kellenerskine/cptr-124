package Lab9;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestArrayUtils {
    @Test
    public void testMaxInArr() {                                        //1m. testing maximum method basic functionality (BF) and BF with neg numbers
        int [] a = {23, 5, -6, 9 ,200};
        int maxExpected = 200;
        int max = ArrayUtils.maximum(a);
        assertEquals(maxExpected, max);
    } 

    @Test
    public void testMaxEmptyArr(){                                      //2m. testing maximum method for if the array is empty
        int [] a = {};
        int [] b = {};
        int maxNumIna = ArrayUtils.maximum(a);
        assertEquals(b, maxNumIna);
    }

    @Test 
    public void testMaxAllSameNum(){                                    //3m. testing for if all the nums in array are the same
        int [] a = {4, 4, 4, 4, 4, 4, 4};
        int expected = 4;
        int maxNumIna = ArrayUtils.maximum(a);
        assertEquals(expected, maxNumIna);
    }

    @Test
    public void testMaxAllButOneSame(){                                 //4m. testing for if all nums are same num but one and the one is smaller
        int [] a = {10, 10, 10, 4, 10, 10};
        int expected = 10;
        int maxNumIna = ArrayUtils.maximum(a);
        assertEquals(expected, maxNumIna);
    }

    @Test
    public void testMaxAllButOneSameB(){                                //5m. testing for if all nums are same num but one and the one is bigger
        int [] a = {4, 4, 4, 10, 4, 4, 4};
        int expected = 10;
        int maxNumIna = ArrayUtils.maximum(a);
        assertEquals(expected, maxNumIna);
    }

    @Test
    public void testMaxAllNegNumsButOne(){                              //6m. testing for if all nums are negative nums but one + the num is: (sameNum * -1)
        int [] a = {-4, -4, -4, 4, -4, -4, -4};
        int expected = 4;
        int maxNumIna = ArrayUtils.maximum(a);
        assertEquals(expected, maxNumIna);
    }

    @Test
    public void testMaxAllPosNumsButOne(){                               //7m. testing for if all nums are positive nums but one and the one is smallest
        int [] a = {4, 4, 4, 4, -6, 4, 4, 4};
        int expected = 4;
        int maxNumIna = ArrayUtils.maximum(a);
        assertEquals(expected, maxNumIna);
    }
    
    @Test
    public void testMaxOfAllNegNums(){                                  //8m. testing for if all nums are negative nums
        int [] a = {-4, -5, -2, -9, -10, -50}
        int expected = -2;
        int maxNumIna = ArrayUtils.maximum(a);
        assertEquals(expected, maxNumIna);
    }

    @Test
    public void testMaxAllPosButOne(){                                  //9m. testing for if all nums are positive but one
        int [] a = {3, 6, 7, 1, 3, -6, 9};
        int expected = 9;
        int maxNumIna = ArrayUtils.maximum(a);
        assertEquals(expected, maxNumIna);
    }

    @Test
    public void testMaxAllNegButOne(){                                  //10m. testing for if all nums are negative but one
        int [] a = {-5, -3, -9, -2, 5, -7};
        int expected = 5;
        int maxNumIna = ArrayUtils.maximum(a);
        assertEquals(expected, maxNumIna);
    }
    //POSSIBLE TRIP-UPS:
    //testing for if the array is null (test for exceptions)


    @Test
    public void testAscending() {                                       //1a. testing basic functionality (BF) and BF with negs
        int[] a = {-10, -0, 4, 6, 9, 2};
        boolean test = ArrayUtils.isAscending(a);
        assertEquals(false, test);
    }

    @Test
    public void testAscendingIfNull(){                                  //2a. testing for if the array is null, should pass if so
        int [] a = null;
        boolean test = ArrayUtils.isAscending(a);
        assertEquals(false, test);
    }


    //POSSIBLE TRIP-UPS:
    //if the array is already sorted
    //if the array is all neg
    //if the array is descending
    //Returns true if all the elements in the array appear in non-descending order
    //duplicates
    //isAscending should return true when passed an empty array

    @Test
    public void testFilterBFandNeg(){                                   //1f. testing for basic functionality (BF) and BF with negs
        int [] a = {3, -2, 8, 1, 9, -10};
        int [] delList = {3, 2, 8, -9, -10};
        int [] expected = {-2, 1, 9};
        int [] c = ArrayUtils.filter(a, delList);
        assertArrayEquals(expected, c);
    }

    @Test
    public void testFilterNullIna(){                                    //2f. test filter for null in array a
        int [] a = null;
        int [] delList = {4, -20, 6, -50, 50};
        int [] c = ArrayUtils.filter(a, delList);
        assertEquals(null, c);
    }

    @Test 
    public void testFilterNullInDelList(){                              //3f. test filter for null in delList
        int [] a = {4, 5 , -2, 50, -50};
        int [] delList = null;
        int [] c = ArrayUtils.filter(a, delList);
        assertEquals(null, c);
    }

    @Test
    public void testFilterBothNull(){                                   //4f. test filter for null in both
        int [] a = null;
        int [] delList = null;
        int [] c = ArrayUtils.filter(a, delList);
        assertEquals(null, c);
    }

    @Test 
    public void testFilterNoSimNums(){                                  //5f. no same nums
        int [] a = {-5, 9, 4, 3, 5000};
        int [] delList = {-59, 2, 20, -5000};
        int [] expected = {-5, 9, 4, 3, 5000};
        int [] c = ArrayUtils.filter(a, delList);
        assertArrayEquals(expected, c);
    }
    
    @Test
    public void testFilterNumsIna(){                                    //6f. 2 of x nums in a, 1 of x num in delList and negative variation
        int [] a = {4, 6, 4, -50, -5000, 5000, 12};
        int [] delList = {4, 6, 5000};
        int [] expected = {-50, -5000, 12};
        int [] c = ArrayUtils.filter(a, delList);
        assertArrayEquals(expected, c);
    }

    @Test
    public void testFilterNumsIndelList(){                              //7f. 1 of x nums in a, 2 of x nums in delList and negative variation
        int [] a = {3, 50, 60, -50, 6};
        int [] delList = {50, 60, -30, 50, 12};
        int [] expected = {3, 10, -50, 6};
        int [] c = ArrayUtils.filter(a, delList);
        assertArrayEquals(expected, c);
    }

    @Test
    public void testFilterSameNumsInboth(){                             //8f. testing for if the two arrays have all the same nums
        int [] a = {4, 6, 9, 1, 5, 0};
        int [] delList = {9, 1, 6, 4, 0, 5};
        int expected [] = {};
        int [] c = ArrayUtils.filter(a, delList);
        assertArrayEquals(expected, c);
    }

    @Test
    public void testFilterSameNumsInbothAndOneSamea(){                  //8f. testing for if the two arrays have all the same nums, with a 2x in a
        int [] a = {4, 6, 9, 1, 1, 5, 0};
        int [] delList = {9, 1, 6, 4, 0, 5};
        int expected [] = {};
        int [] c = ArrayUtils.filter(a, delList);
        assertArrayEquals(expected, c);
    }

    @Test
    public void testFilterSameNumsInbothAndOneSamedel(){               //8f. testing for if the two arrays have all the same nums, with a 2x in delList
        int [] a = {4, 6, 9, 1, 5, 0};
        int [] delList = {9, 1, 4, 6, 4, 0, 5};
        int expected [] = {};
        int [] c = ArrayUtils.filter(a, delList);
        assertArrayEquals(expected, c);
    }
    //DONE WITH FILTER?
}








//testing double arrays assertArrayEquals(expected, answer, 0.001)