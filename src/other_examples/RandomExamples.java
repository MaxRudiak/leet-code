package other_examples;

import java.util.Arrays;

public class RandomExamples {

//    public static int sum(int[] arr){
//        return Arrays.stream(arr).filter(x -> x > 0).reduce(Integer::sum).orElse(0);
//    }
//
//    public static String repeatStr(final int repeat, final String string) {
//        for (int i = 0; i <= repeat; ++i) {
//             return new StringBuilder().append(string).toString();
//        }
//        return null;
//    }

    public static String reverseWords(String original) {
        String revStr = "";
        for (int i = original.length() - 1; i >= 0; i--) {
            revStr = new StringBuilder().append(revStr).append(original.charAt(i)).toString();
        }
        return revStr;
    }

        public static void main(String[] args) {
            System.out.println(reverseWords("The quick brown fox jumps over the lazy dog."));

    }




}
