package e1_two_pointers.in_one_diraction;

import java.util.Arrays;

public class MoveZeroes283 {

    public static void main(String[] args) {
        int[] test = new int[]{2,3,0,5,0,5,0,17};
        moveZeroes(test);
        System.out.println(Arrays.toString(test));
    }

    public static void moveZeroes(int[] nums) {
        int write = 0;
        for (int read = 0; read < nums.length; read++) {
            if (nums[read] != 0) {
                nums[write] = nums[read];
                write++;
            }
        }

        while (write < nums.length) {
            nums[write] = 0;
            write++;
        }
    }
}
