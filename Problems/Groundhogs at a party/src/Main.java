import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // put your code here
        int n = scanner.nextInt();
        boolean k = scanner.nextBoolean();
        if (k) {
            n -= 5;
        }
        System.out.print(10 <= n && n <= 20);
    }
}