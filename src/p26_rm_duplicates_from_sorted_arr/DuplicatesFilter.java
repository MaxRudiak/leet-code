package p26_rm_duplicates_from_sorted_arr;

public class DuplicatesFilter {

    public static int removeDuplicatesFromSortedArray(int[] arr) {
        if (arr == null || arr.length == 0) {
            return 0;
        }
        int curr = arr[0];
        int res = 1;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] != curr) {
                curr = arr[i];
                arr[res] = curr;
                res++;
            }
        }
        return res;
    }

    public static void main(String[] args) {
        System.out.println(removeDuplicatesFromSortedArray(new int[]{1,1,2,2,3,3,4}));
    }
}
