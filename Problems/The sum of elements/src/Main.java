import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);

        int a;
        long p = 0;
        do {
            a = scanner.nextInt();
            p += a;
        } while (a != 0);
        System.out.println(p);
    }
}