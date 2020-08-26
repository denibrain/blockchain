import java.time.LocalDateTime;
import java.time.ZoneOffset;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        LocalDateTime dt1 = LocalDateTime.parse(scanner.nextLine().trim());
        LocalDateTime dt2 = LocalDateTime.parse(scanner.nextLine().trim());
        ZoneOffset z = ZoneOffset.UTC;
        System.out.print(Math.abs(dt1.toEpochSecond(z) - dt2.toEpochSecond(z)) / 3600);
    }
}