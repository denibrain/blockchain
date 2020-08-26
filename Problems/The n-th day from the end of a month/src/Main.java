import java.time.LocalDate;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        int year = scanner.nextInt();
        int month = scanner.nextInt();
        int day = scanner.nextInt();
        LocalDate d = LocalDate.of(year, month, 1);
        LocalDate d1 = LocalDate.of(year, month, d.lengthOfMonth() - day + 1);

        System.out.println(d1);
    }
}