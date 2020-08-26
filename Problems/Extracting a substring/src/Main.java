import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        String l = scanner.nextLine();
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        System.out.println(l.substring(a, b + 1));
    }
}