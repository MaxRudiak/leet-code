package p169_major_element;

public class Solution {

    public static int majorityElement(int[] nums) {
        int count = 0;
        int elem = 0;
        for (int num : nums) {
            if (count == 0)
                elem = num;
            if (num != elem)
                count--;
            else
                count++;
        }
        return elem;
    }

    public static void main(String[] args) {
        System.out.println(majorityElement(new int[]{3,7,3,2,1,3,3,7,3,7}));
    }
}
