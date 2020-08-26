import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        // write your code here

        LocalDateTime t = LocalDateTime.parse(scanner.next());
        int h = scanner.nextInt();
        int m = scanner.nextInt();

        System.out.println(t.minusHours(h).plusMinutes(m));
    }
}