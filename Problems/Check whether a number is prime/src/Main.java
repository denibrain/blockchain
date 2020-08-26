import java.util.Scanner;
import java.util.concurrent.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ExecutorService executor = Executors.newFixedThreadPool(4); // assign an object to it

        while (scanner.hasNext()) {
            int number = scanner.nextInt();
            executor.submit(new PrintIfPrimeTask(number));
        }
        executor.shutdown();
    }
}

class PrintIfPrimeTask implements Runnable {
    private final int number;

    public PrintIfPrimeTask(int number) {
        this.number = number;
    }

    @Override
    public void run() {
        if (isPrime(number)) {
            System.out.println(number);
        }
    }

    private boolean isPrime(int n) {
        if (number <= 1) return false;
        if (number == 2 || n==3) return true;
        if ((number % 2 == 0) || (number % 3) == 0) return false;

        int i = 5;
        while (i * i <= number) {
            if (number % i == 0 || number % (i + 2) == 0) return false;
            i += 6;
        }
        return true;
    }
}