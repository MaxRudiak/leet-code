package p88_merge_sorted_array;

import java.util.Arrays;

public class Solution {

    public static void merge (int[] num1, int m, int[] num2, int n ) {
        int i = m - 1;
        int j = n - 1;
        int k = m + n - 1;

        while (j >= 0) {
            if (i >= 0 && num1[i] > num2[j]) {
                num1[k--] = num1[i--];
            }
            else {
                num1[k--] = num2[j--];
            }
        }
    }

    public static void main(String[] args) {
        int[] res = new int[]{1,2,3,0,0,0};
        merge(res, 3, new int[]{2,5,5}, 3);
        Arrays.stream(res).forEach(System.out::print);
    }
}
