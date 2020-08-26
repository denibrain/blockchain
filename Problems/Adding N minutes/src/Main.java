import java.time.LocalDateTime;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        // write your code here

        LocalDateTime t = LocalDateTime.parse(scanner.next());
        int m = scanner.nextInt();
        t = t.plusMinutes(m);

        System.out.println(t.getYear()+ " "+t.getDayOfYear() + " "+t.toLocalTime());
    }
}