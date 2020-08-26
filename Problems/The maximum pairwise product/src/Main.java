import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt() - 2;
        int m = scanner.nextInt();
        int k = scanner.nextInt();
        if (m < k) {
            int t = k;
            k = m;
            m = t;
        }
        while (n-- > 0) {
            int a = scanner.nextInt();
            if (a > m) {
                k = m;
                m = a;
            } else if (a > k) {
                k = a;
            }
        }
        System.out.print(k * m);
    }
}