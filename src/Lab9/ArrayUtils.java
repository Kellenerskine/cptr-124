package Lab9;
/**
 * A class containing various methods for processing integer arrays
 */
public class ArrayUtils {
    /**
     * Returns the largest value in array {@code a}.
     * 
     * @param a the array to examine
     * @return the largest value in array {@code a}
     * @throws IllegalArgumentException if the array is empty or {@code null}
     */
    public static int maximum(int[] a) {
        //int[] a = {5, 6, 9, 3};
        int max = 0;
        for (int i = 0; i < a.length; i++){
            if (a[i] > max){
                max = a[i];
            }
        }
        return max; // Replace with your code
    }

    /**
     * Returns true if the elements of array {@code a} are arranged in ascending
     * order. If any element appears after an element greater than itself, the
     * method returns false. An empty array by default is considered to be in
     * ascending order.
     * 
     * The method returns false if the array is {@code null}.
     * 
     * This method does not disturb the contents of either array.
     * 
     * The method uses no extra space except for a few local scalar variables.
     * 
     * @param a the array to examine
     * @return true if the array is sorted; otherwise, false
     * @throws IllegalArgumentException if the array is null
     */
    public static boolean isAscending(int[] a) {
        return false; // Replace with your code
    }

    /**
     * Returns a new array that contains the elements of {@code a}, in exactly the
     * same order, except any element that also appears in array {@code delList}
     * will be excluded from the result. For example, if {@code list1} contains 1,
     * 2, 3, 4, 5, 6 and {@code list2} contains 2, 4, 7, the call
     * {@code ArrayUtils.filter(list1, list2)} would produce a new array containing
     * 1, 3, 5, 6.
     * 
     * Duplicate elements in {@code delList} do not affect the outcome of the
     * filter.
     * 
     * @param a       the array to filter
     * @param delList the containing the elements to exclude from the resulting
     *                array
     * @return a new array containing all the elements of {@code a}, in exactly the
     *         same order, excluding any element found in {@code delLists}; returns
     *         {@code null} if either or both arrays are {@code null}
     */
    public static int[] filter(int[] a, int[] delList) {
        return null; // Replace with your code
    }

    /**
     * Physically rearranges the elements of {@code a} so that all the elements are
     * shifted towards the back by a distance of {@code distance}. As an element
     * "falls off" the rear, it is placed at the front in the space vacated when the
     * first element was shifted backwards. For example, if {@code list} contains
     * the elements 1, 2, 3, 4, 5, and 6, the call
     * {@code ArrayUtils.rotate(list, 2)} rearranges {@code list} to contain 5, 6,
     * 1, 2, 3, and 4. Notice that if {@code distance} is equal to the size of the
     * array, after the rotation all the elements rotate to their original
     * locations. If {@code distance} is negative, the elements are shifted forward
     * {@code n} spots instead of backwards. As an element "falls off" the front it
     * is placed on the rear in the space vacated when the last element was shifted
     * forwards.
     * 
     * The method uses no extra space except for a few local scalar variables.
     * 
     * @param a        the array to rotate
     * @param distance the number of positions to rotate toward the back of the
     *                 array
     * @throws IllegalArgumentException if the array is {@code null}
     */
    public static void rotateRight(int[] a, int distance) {
        // Add your code
    }

    /**
     * Computes the rolling average of an array of integers based on a given
     * interval. The client specifies the range of values to average. The resulting
     * array is a double-precision floating-point array of the rolling averages. For
     * example, given array {@code arr} = {3, 2, 4, 6, 20, 1, 3}, the call
     * {@code rollingAverage(arr, 3)} would produce the array { 3.0, 4.0, 10.0, 9.0,
     * 8.0 }.
     * 
     * @param a        the original array of integer values. If {@code a} is empty
     *                 or {@code null}, the method throws an
     *                 {@code IllegalArgumentException}.
     * @param interval the range of elements in the original array to average when
     *                 computing the rolling average. If {@code interval} is greater
     *                 than the number of elements in {@code a} or is less than one,
     *                 the method throws an {@code IllegalArgumentException}.
     * @return a double-precision floating-point array containing the rolling
     *         average of the original array.
     * @throws IllegalArgumentException if the array is empty or {@code null} or if
     *                                  {@code interval} is less than 1 or greater
     *                                  than the number of elements in the array.
     */
    public static double[] rollingAverage(int[] a, int interval) {
        return null;
    }

}