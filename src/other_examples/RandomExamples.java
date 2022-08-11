package other_examples;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

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

//    public static String reverseWords(String original) {
//        String revStr = "";
//        for (int i = original.length() - 1; i >= 0; i--) {
//            revStr = new StringBuilder().append(revStr).append(original.charAt(i)).toString();
//        }
//        return revStr;
//    }

//    public static String areYouPlayingBanjo(String name) {
//        if((name.startsWith("r")) || name.startsWith("R")) {
//            return "yes";
//        } else {
//            return "false";
//        }
//    }

//    public static int[] minMax(int[] arr) {
//        for(int i = 0; i < arr.length - 1; i++) {
//            if(arr[i] > arr[i + 1]) {
//                int temp = arr[i + 1];
//                arr[i + 1] = arr[i];
//                arr[i] = temp;
//            }
//        }
//        return new int[]{arr[0], arr[arr.length - 1]};
//    }

//    public static String doubleChar(String s){
//        //enter your code here
//        char[] letters = s.toCharArray();
//        StringBuilder builder = new StringBuilder();
//            for (int i = 0; i < letters.length; i++) {
//            builder.append(s.charAt(i)).append(s.charAt(i));
//        }
//        return builder.toString();
//    }

//    public static int[] countPositivesSumNegatives(int[] input) {
//
//
//            int[] counters = new int[2];
//            int positiveCount = 0;
//            int negativeCount = 0;
//
//            try{
//            for (int i = 0; i < input.length; i++) {
//
//                if (input[i] > 0) {
//                    positiveCount = positiveCount + 1;
//                } else {
//                    negativeCount = negativeCount + input[i];
//                }
//                counters[0] = positiveCount;
//                counters[1] = negativeCount;
//            }
//
//        } catch (NullPointerException | IllegalArgumentException e) {
//            e.printStackTrace();
//        }
//        return counters;
//    }

//    public static boolean solution(String str, String ending) {
//        int endingLength = ending.length();
//        String stringToCompare = "";
//        for (int i = endingLength; i > 0 ; i--) {
//            if (str.length() > endingLength) {
//                stringToCompare = new StringBuilder()
//                        .append(stringToCompare)
//                        .append(str.charAt(str.length() - i))
//                        .toString();
//            }
//        }
//        return ending.equals(stringToCompare);
//    }

//    public static List<Object> filterList(final List<Object> list) {
//        List<Object> result = list.stream().filter(x -> x instanceof Integer).collect(Collectors.toList());
//        return result;
//    }

//    public static String correct(String s) {
//        char[] sToArray = s.toCharArray();
//        for (int i = 0; i < sToArray.length; i++) {
//            if (sToArray[i] == '5') {
//                sToArray[i] = 'S';
//            } else if (sToArray[i] == '1') {
//                sToArray[i] = 'I';
//            } else if (sToArray[i] == '0') {
//                sToArray[i] = 'O';
//            }
//        }
//        return String.valueOf(sToArray);
//    }

//    // highAndLow("1 2 3 4 5")  return "5 1"
//    public static String highAndLow(String numbers) {
//        List<Integer> ints = Stream.of(numbers.split(" "))
//                .map(Integer::valueOf)
//                .sorted()
//                .collect(Collectors.toList());
//
//        return new StringBuilder()
//                .append(ints.get(ints.size() - 1))
//                .append(" ")
//                .append(ints.get(0))
//                .toString();
//    }

//    public static int duplicateCount(String text) {
//        // Write your code here
//        Map<Character, Integer> map = new HashMap<>();
//        int counter = 0;
//
//        for (int i = 0; i < text.length(); i++) {
//            if (map.containsKey(text.charAt(i))) {
//                counter = map.get(text.charAt(i)) + 1;
//            }
//            map.put(text.charAt(i), i);
//        }
//
//        int counter2 = 0;
//        Set<Map.Entry<Character, Integer>> entries = map.entrySet();
//        for (Map.Entry<Character, Integer> pairs : entries) {
//            if (pairs.getValue() > 1) {
//                counter2 = counter2 + 1;
//            }
//        }
//        return counter2;
//    }
//
//    public static long numberOfDivisors(int n) {
//        int delitel = 1;
//        long counter = 0;
//        for (int i = 0; i <= n; i++) {
//            if(n % delitel == 0) {
//                counter = counter + 1;
//            }
//            delitel = delitel + 1;
//        }
//        return counter;
//    }
//
//    public static Map<String, List<Integer>> getPeaks(int[] arr) {
//
//        Map<String, List<Integer>> map = new HashMap<>();
//        List<Integer> pos = new ArrayList<>();
//        List<Integer> peaks = new ArrayList<>();
//        map.put("pos", pos);
//        map.put("peaks", peaks);
//
//        for (int i = 1; i < arr.length - 1; i++) {
//            if (arr[i] > arr[i - 1] && arr[i] > arr[i + 1]) {
//                pos.add(i);
//                peaks.add(arr[i]);
//            }
//
//        }
//        return map;
//    }

    public static String makeReadable(int seconds) {

        int h = seconds / 3600;
        String hh = "";
        if(0 <= h && h <= 9) {
            hh = new StringBuilder().append(hh).append("0").append(h).toString();
        } else {
            hh = new StringBuilder().append(hh).append(h).toString();
        }

        int m = (seconds - h * 3600) / 60;
        String mm = "";
        if(0 <= m && m <= 9) {
            mm = new StringBuilder().append(mm).append("0").append(m).toString();
        } else {
            mm = new StringBuilder().append(mm).append(m).toString();
        }

        int s = seconds - (h * 3600) - (m * 60);
        String ss = "";
        if(0 <= s && s <= 9) {
            ss = new StringBuilder().append(ss).append("0").append(s).toString();
        } else {
            ss = new StringBuilder().append(ss).append(s).toString();
        }

        return hh + ":" + mm + ":" + ss;
    }

    public static void main(String[] args) {

        System.out.println(makeReadable(5));

    }

}
