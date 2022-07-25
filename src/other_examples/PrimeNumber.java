package other_examples;

public class PrimeNumber {

    static void checkIfNumberIsPrime(int number) {
        int tempNumber;
        boolean numberIsPrime = true;

        for (int i = 2; i <= number / 2; i++) {
            tempNumber = number % 2;
            if(tempNumber == 0) {
                numberIsPrime = false;
                break;
            }
        }
        if(numberIsPrime) {
            System.out.println(number +": is prime");
        }
        else {
            System.out.println(number +": is not prime");
        }
    }

    public static void main(String[] args) {
        checkIfNumberIsPrime(3);
    }
}
