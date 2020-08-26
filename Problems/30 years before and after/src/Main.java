import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        LocalDate d = LocalDate.parse(scanner.nextLine());
        System.out.println(d.minusYears(30));
        System.out.println(d.plusYears(30));
    }
}