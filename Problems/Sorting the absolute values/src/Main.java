import java.util.*;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Scanner scanner = new Scanner(System.in);
        System.out.println(Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .map(Math::abs).sorted().mapToObj(Integer::toString).collect(Collectors.joining(" ")));
    }
}