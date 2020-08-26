import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        System.out.println((-15 < a && a <= 12 ) || (14 < a && a < 17) || (19 <= a) ? "True" : "False");

    }
}