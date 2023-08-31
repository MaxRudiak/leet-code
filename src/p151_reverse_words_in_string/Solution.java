package p151_reverse_words_in_string;

public class Solution {
    public static String reverseWords(String s) {
        String[] parts = s.trim().split("\\s+");
        StringBuilder sb = new StringBuilder();

        for (int i = parts.length - 1; i > 0; i--) {
            sb.append(parts[i] + " ");
        }
        return sb + parts[0];
    }

    public static void main(String[] args) {
        System.out.println(reverseWords("the sky is blue"));
    }
}
