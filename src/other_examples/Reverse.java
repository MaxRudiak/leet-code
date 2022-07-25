package other_examples;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Reverse {
    static String currentString = "java";

    List<Integer> intList = new LinkedList<>();

    static String reverse(String s) {
        String reversedString = "";
        for (int i = s.length() - 1; i >= 0; i--) {
            reversedString = new StringBuilder().append(reversedString).append(s.charAt(i)).toString();
        }
        return reversedString;
     }

    public static String solution(String str) {
        return new StringBuilder().append(str).reverse().toString();
    }

    public static void main(String[] args) {
        System.out.println(reverse(currentString));
    }
}
