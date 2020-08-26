import java.time.LocalDate;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        LocalDate localDate = LocalDate.parse(scanner.next());
        int days = scanner.nextInt();
        int year = localDate.getYear();
        while (year == localDate.getYear()) {
            System.out.println(localDate);
            localDate = localDate.plusDays(days);
        }
    }
}