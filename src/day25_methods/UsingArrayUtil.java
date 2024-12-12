package day25_methods;

import my_utilities.ArrayUtil;

public class UsingArrayUtil {
    public static void main(String[] args) {

        int [] nums = {23, 345, 23, 1356, 765, 2344, 2};
        System.out.println(ArrayUtil.minNumInArr(nums));
        System.out.println();
        System.out.println(ArrayUtil.maxNumInArr(nums));
        System.out.println(ArrayUtil.contains(nums, 23));
        System.out.println(ArrayUtil.contains(nums, 678));


    }
}
