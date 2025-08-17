package arrays_demo;

public class ArrayAccess {
    public static void main(String[] args) {
        String [] mammals = {"monkey", "chimp", "donkey"};
        System.out.println(mammals.length);
        System.out.println(mammals[0]);
        System.out.println(mammals[1]);
        System.out.println(mammals[2]);

        String [] birds = new String[6];
        System.out.println(birds.length);

        int[] nums = new int[10];
        for (int i = 0; i < nums.length; i++) {
            nums[i] = i+5;
        }
        System.out.println(nums[0]);
        System.out.println(nums[1]);
        System.out.println(nums[2]);
        //nums[10] = 7; //ArrayIndexOutOfBoundsException
        //nums[nums.length] = 9; //ArrayIndexOutOfBoundsException
//        for (int i = 0; i <= nums.length; i++) { //java.lang.ArrayIndexOutOfBoundsException
//            nums[i] = i+5;
//        }
    }
}
