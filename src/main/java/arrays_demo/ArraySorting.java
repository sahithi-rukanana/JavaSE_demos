package arrays_demo;

import java.util.Arrays;

public class ArraySorting {
    public static void main(String[] args) {
        int[] nums = {3, 7, 9, 2};
        Arrays.sort(nums);

        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i] + " ");
        }
        System.out.println();
        String[] strings = {"10", "9", "100"};
        Arrays.sort(strings);
        for (String string : strings) {
            System.out.print(string+ " ");
        }
    }
}
