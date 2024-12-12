package my_utilities;

import java.util.Arrays;

public class ArrayUtil {

    /**
     * This method returns the minimum value in the given int array
     * @param arr
     * @return min value from the given int arr
     * @Made by: Nazarii
     */
    public static int minNumInArr (int [] arr) {
        int min = 0;
        Arrays.sort(arr);
        min = arr[0];
        return min;
    }

    /**
     This method returns the maximum value in the given int array
     * @param arr
     * @return max value from the given int arr
     * @Made by: Nazarii
     */
    public static int maxNumInArr (int [] arr) {
        int max = 0;
        Arrays.sort(arr);
        max = arr[arr.length-1];
        return max;
    }

    /**
     * This method returns boolean whether given int array contains the given number
     * @param arr is given array
     * @param num is given number
     * @return boolean whether contains or not
     * @ Made by: Nazarii
     */
    public static boolean contains (int [] arr, int num) {
        boolean result = false;

        for (int each : arr) {
            if (each == num) {
                result = true;
                break;
            }
        }
        return result;
    }

}
