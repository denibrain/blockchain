import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // put your code here
        int h = scanner.nextInt();
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int n = (h - a) / (a - b) + 1;
        if (n * a - b * (n - 1) < h) {
            n += 1;
        }
        System.out.print(n);
    }
}