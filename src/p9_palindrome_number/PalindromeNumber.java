package p9_palindrome_number;

public class PalindromeNumber {

    public static boolean isPalindrome(int x) {
        String revertedStr = (new StringBuilder(x + "")).reverse().toString();
        return (x + "").equals(revertedStr);
    }

    public static boolean isPalindromeNotUsingString(int x) {
        int reversed = 0;
        int temp = x;
        while (temp != 0) {
            reversed = reversed * 10 + temp % 10;
            temp /= 10;
        }
        return reversed == x;
    }

    public static void main(String[] args) {
        System.out.println(isPalindrome(1223));
        System.out.println(isPalindromeNotUsingString(1221));
    }
}
