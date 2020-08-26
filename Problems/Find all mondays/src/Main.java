import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        final Scanner scanner = new Scanner(System.in);
        final int year = scanner.nextInt();
        final int month = scanner.nextInt();
        LocalDate d = LocalDate.of(year, month, 1);
        DayOfWeek dw = d.getDayOfWeek();
        int monday =  1 + (dw.getValue() == 1 ? 0 : 8 - dw.getValue());
        while (monday <= d.lengthOfMonth()) {
            System.out.println(LocalDate.of(year, month, monday));
            monday+=7;
        }
    }
}