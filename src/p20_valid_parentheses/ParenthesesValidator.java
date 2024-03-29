package p20_valid_parentheses;

import java.util.ArrayDeque;
import java.util.Deque;

public class ParenthesesValidator {

    public static boolean isValid(String s) {
        Deque<Character> deque = new ArrayDeque<>();

        for (char c : s.toCharArray()) {
            if (c == '(') {
                deque.push(')');
            } else if (c == '{') {
                deque.push('}');
            } else if (c == '[') {
                deque.push(']');
            } else if (deque.isEmpty() || deque.pop() != c) {
                return false;
            }
        }
        return deque.isEmpty();
    }

    public static void main(String[] args) {
        System.out.println(isValid("("));
    }
}
