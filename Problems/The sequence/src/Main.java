import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = 0;
        int a = 1;
        int b = 0;
        while (k < n) {
            if (k != 0) System.out.print(" ");
            k++;
            System.out.print(a);
            b++;
            if (b == a) {
                a++;
                b=0;
            }
        }
    }
}