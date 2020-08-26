import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] words = scanner.nextLine().trim().split("[^a-zA-Z0-9]+");

        Arrays.stream(words)
                .filter(w -> w.length() > 0)
                .map(String::toLowerCase)
                .sorted()
                .collect(Collectors.groupingBy(w -> w, Collectors.counting()))
                .entrySet().stream().sorted((a, b) -> b.getValue().equals(a.getValue())
                    ? a.getKey().compareTo(b.getKey())
                    : Long.compare(b.getValue(), a.getValue()))
                .limit(10)
                .forEach(e -> System.out.println(e.getKey()));
    }
}