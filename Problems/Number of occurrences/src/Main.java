import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        String a = scanner.nextLine();
        String b = scanner.nextLine();
        int p = a.indexOf(b);
        int n = 0;
        while (p>=0) {
            n++;
            p = a.indexOf(b, p + 1);
        }
        System.out.print(n);
    }
}