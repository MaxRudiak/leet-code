package p55_jump_game;

public class Solution {
    public static boolean canJump(int[] nums) {
        int max = 0;
        for (int i = 0; i < nums.length; i++) {
            if (i > max) {
                return false;
            }
            max = Math.max(nums[i] + i, max);
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(canJump(new int[]{3,2,1,0,4}));
    }
}
