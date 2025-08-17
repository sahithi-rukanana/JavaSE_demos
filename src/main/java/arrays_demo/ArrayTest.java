package arrays_demo;

import java.util.Arrays;

public class ArrayTest {
    public static void main(String[] args) {
        int[] numbers1 = new int[3];
        System.out.println(numbers1);

        int[] numbers2 = new int[]{42, 55, 99};
        System.out.println(numbers2);
        int[] numbers3 = {42, 55, 99};

        int[] a1 ;
        int [] a2 ;
        int a3[];
        int a4 [];

        String [] bugs = {"cricket","beetle","ladybug"};
        String [] alias = bugs;
        System.out.println(bugs.equals(alias));
        System.out.println(bugs);
        System.out.println(bugs.toString());
        System.out.println(Arrays.toString(bugs));
        System.out.println(numbers1.length);
        String names[] = new String[2];
        System.out.println(Arrays.toString(names));

        //casting
        String[] strings = {"StringValue"};
        Object[] objects = strings;

        String[] againStrings = (String[]) objects;
    }
}
