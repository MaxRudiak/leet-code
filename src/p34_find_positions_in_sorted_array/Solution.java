package p34_find_positions_in_sorted_array;

import java.util.Arrays;

public class Solution {
    public static int[] searchRange(int[] nums, int target) {
        double left = target - 0.5;
        double right = target + 0.5;

        int leftIndex = binarySearch(nums, left);
        int rightIndex = binarySearch(nums, right);

        if (leftIndex == rightIndex) {
            return new int[]{-1, -1};
        } else {
            return new int[]{leftIndex, rightIndex - 1};
        }
    }

    private static int binarySearch(int[] nums, double target) {
        int left = 0;
        int right = nums.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (target > nums[mid]) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return left;
    }

    public static void main(String[] args) {
        Arrays.stream(searchRange(new int[]{5, 7, 7, 8, 8, 10}, 7)).forEach(System.out::println);
    }
}
