package arrays_demo;

import java.util.Arrays;

public class ArraySearch {
    public static void main(String[] args) {

            int[] numbs = {2,4,6,8};
            System.out.println(Arrays.binarySearch(numbs,2));
            System.out.println(Arrays.binarySearch(numbs,4));
            System.out.println(Arrays.binarySearch(numbs,5));
            System.out.println(Arrays.binarySearch(numbs,3));
            System.out.println(Arrays.binarySearch(numbs,9));

    }
}
