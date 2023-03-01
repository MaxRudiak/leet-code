package p7_reverse_integer;

public class ReverseInteger {

    public static int reverse(int x) {
        long reverseDigits = 0;
        while (x != 0) {
            reverseDigits = reverseDigits * 10 + x % 10;
            x /= 10;
        }
        return (reverseDigits < Integer.MIN_VALUE || reverseDigits > Integer.MAX_VALUE) ? 0 : (int) reverseDigits;
    }

    public static void main(String[] args) {
        System.out.println(reverse(12234567));
    }
}
