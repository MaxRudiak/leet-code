package other_examples;

import java.util.Arrays;

public class FindElementInArray {

    public static boolean check(Object[] a, Object x) {
        return Arrays.stream(a).anyMatch(x::equals);
    }

    public static int grow(int[] x){
        return Arrays.stream(x).reduce((a,b) -> a * b).orElse(0);
    }

    public static void main(String[] args) {
//        System.out.println(check(new Integer[]{1,2,3}, 5));
//        System.out.println(check(new String[]{"a","b","c"}, "b"));
        System.out.println(grow(new int[]{1,2,3}));
    }
}
