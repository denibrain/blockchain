import java.time.LocalTime;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // write your code here

        LocalTime tm = LocalTime.parse(scanner.next());
        LocalTime tm2 = LocalTime.parse(scanner.next());

        System.out.println(Math.abs(tm.toSecondOfDay() - tm2.toSecondOfDay()));
    }
}