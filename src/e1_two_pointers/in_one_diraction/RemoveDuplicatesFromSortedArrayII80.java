package e1_two_pointers.in_one_diraction;

public class RemoveDuplicatesFromSortedArrayII80 {

    public static void main(String[] args) {
        System.out.println(removeDuplicates(new int[]{1,1,1,2,2,3}));
    }

    public static int removeDuplicates(int[] nums) {
        if (nums.length < 2) {
            return 0;
        }

        int write = 2;
        for (int read = 2; read < nums.length; read++) {
            if (nums[read] != nums[write - 2]) {
                write++;
                nums[write] = nums[read];
            }
        }
        return write;
    }
}
