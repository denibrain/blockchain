import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        String s = scanner.next();
        int n = scanner.nextInt();
        if (n >= s.length() || n <= 0) {
            System.out.print(s);
            return;
        }
        String v = "";
        for (int i = n; i < s.length();  i++) {
            v += s.charAt(i);
        }
        for (int i = 0; i < n;  i++) {
            v += s.charAt(i);
        }
        System.out.print(v);
    }
}