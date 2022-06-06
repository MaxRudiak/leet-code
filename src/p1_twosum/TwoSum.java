package p1_twosum;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    public static int[] twoSum(int[] nums, int target) {
        int[] result = new int[2];
        Map<Integer, Integer> numToIndex = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if(numToIndex.containsKey(target - nums[i])) {
                result[0] = numToIndex.get(target - nums[i]);
                result[1] = i;
                return result;
            }
            numToIndex.put(nums[i], i);
        }
        throw new IllegalArgumentException("Impossible to obtain target from this array");
    }

    public static void main(String[] args) {
        int[] testArray = new int[]{5, 3, 11, 22, 6};
        int[] indices = twoSum(testArray, 28);
        Arrays.stream(indices)
                .forEach(System.out::println);
    }
}
