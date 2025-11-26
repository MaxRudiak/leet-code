package e1_two_pointers.in_one_diraction;

public class RemoveElement27 {

    public static void main(String[] args) {
        System.out.println(removeElement(new int[]{1,3,2,2,3}, 3));
    }

    public static int removeElement(int[] nums, int val) {
        int write = 0;
        for (int read = 0; read < nums.length; read++) {
            if (nums[read] != val) {
                nums[write] = nums[read];
                write++;
            }
        }
        return write;
    }
}
