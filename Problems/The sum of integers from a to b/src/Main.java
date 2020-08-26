import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int a = 0;
        for (int i=n; i<=m; i++) {
            a+=i;
        }
        System.out.println(a);
    }
}