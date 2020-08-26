import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int c = 0;
        int p = 0;
        int prev = 0;
        while (n-- > 0) {
            int a = scanner.nextInt();
            if (p == 0 ) {
                p = 1;
            } else if (prev != a - 1) {
                if (p >= 3) c+= p - 2;
                p = 1;
            } else if (prev == a - 1) {
                p++;
            }
            prev = a;
        }
        if (p >= 3) c+= p - 2;
        System.out.print(c);
    }
}