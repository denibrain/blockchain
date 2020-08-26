import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        // write your code here
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        int d = scanner.nextInt();
        System.out.println(IntStream.rangeClosed(a, b).filter(i -> (i % c) == 0 || (i % d) == 0).sum());
    }
}