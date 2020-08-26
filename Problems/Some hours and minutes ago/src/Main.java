import java.time.LocalTime;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        String t = scanner.next();
        int h = scanner.nextInt();
        int m = scanner.nextInt();
        LocalTime tm = LocalTime.parse(t);

        System.out.println(tm.minusHours(h).minusMinutes(m));
    }
}