import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine().replace(" ", "");
        String s1 = scanner.nextLine().replace(" ", "");
        System.out.print(s1.equals(s));
    }
}