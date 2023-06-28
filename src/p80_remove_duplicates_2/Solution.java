package p80_remove_duplicates_2;

public class Solution {

    public static int removeDuplicates(int[] nums) {
        int counter = 0;
        for (int i = 0; i < nums.length; i++) {
            if (counter < 2 || nums[i] > nums[counter - 2]) {
                nums[counter++] = nums[i];
            }
        }
    return  counter;
    }

    public static void main(String[] args) {
        System.out.println(removeDuplicates(new int[]{1,1,1,2,2,2,3,}));
    }
}
