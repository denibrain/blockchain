import java.util.*;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        if (n == 0) {
            System.out.println(0);
            return;
        }
        List<String> lines = new ArrayList<>();
        while (n > 0) {
            --n;
            lines.add(scanner.nextLine().trim());
        }
        System.out.println(lines.stream()
                .flatMap(l -> Arrays.stream(
                        l.toLowerCase()
                                .split(" ")))
                .filter(l -> l.length() > 0)
                .distinct()
                .count());
    }
}