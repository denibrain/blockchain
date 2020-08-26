import java.util.Scanner;
import java.util.stream.*;

class PrimeNumbers {

    /**
     * Checking if a number is prime
     *
     * @param number to test >= 2
     * @return true if number is prime else false
     */
    private static boolean isPrime(long number) {
        // write your code here
        if (number == 2 || number == 3) {
            return true;
        }
        if (number <= 1 || (number & 1) == 0) {
            return false;
        }
        return LongStream.rangeClosed(3, number / 2).filter(x -> (number % x) == 0).count() == 0;
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String line = scanner.nextLine().trim();

        int n = Integer.parseInt(line);

        System.out.println(isPrime(n) ? "True" : "False");
    }
}