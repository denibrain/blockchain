import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        int m = 0;
        do {
            int n = scanner.nextInt();
            if (n == 0) {
                break;
            }
            if (n > m) {
                m = n;
            }
        } while (true);
        System.out.print(m);
    }
}