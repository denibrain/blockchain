import java.time.LocalDateTime;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        // write your code here

        LocalDateTime t = LocalDateTime.parse(scanner.next());

        System.out.println(t.plusHours(11).toLocalDate());
    }
}