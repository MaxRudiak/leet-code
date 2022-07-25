package other_examples;

import java.util.HashMap;
import java.util.Map;

public class DuplicatesInArray {

    static Map<Integer, Integer> getDuplicates(int[] arr) {

        Map<Integer, Integer> numsWithIndexes = new HashMap<>();
        Map<Integer, Integer> duplicates = new HashMap<>();

        for (int i = 0; i < arr.length; i++) {

            if (numsWithIndexes.containsKey(arr[i])) {
                duplicates.put(arr[i], i);
            }
            numsWithIndexes.put(arr[i], i);
        }
        return duplicates;
    }

    public static void main(String[] args) {
        int[] array = {2, 4, 7, 4, 2, 1, 1, 10, 100, 11};
        System.out.println(getDuplicates(array));
    }

}
