package p27_rm_element_from_arr;

public class ElementDeletion {

    public static int removeElement(int[] nums, int val) {
        int aimLength = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[aimLength] = nums[i];
                aimLength++;
            }
        }
        return aimLength;
    }

    public static void main(String[] args) {
        System.out.println(removeElement(new int[]{1,3,5,3,2,3,4,7,8}, 3));
    }
}
