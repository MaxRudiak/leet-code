package other_examples;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class NumberToReversedArrayOfDigits {

    public static int[] digitize(long n) {
        List<Integer> listOfDigits = new LinkedList<>();
        while(n > 0) {
            int digit = (int) n % 10;
            n = n / 10;
            listOfDigits.add(digit);
        }
        Integer[] reversedArrayInteger = listOfDigits.toArray(new Integer[0]);
        int[] reversedArray = new int[reversedArrayInteger.length];
        for (int i = 0; i < reversedArray.length; i++) {
            reversedArray[i] = reversedArrayInteger[i];
        }
        return reversedArray;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(digitize(1234567L)));
    }
}
