import java.util.*;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Scanner scanner = new Scanner(System.in);
        System.out.println(
                Arrays.stream(scanner.nextLine().split(" "))
                        .mapToInt(Integer::parseInt).map(Math::abs).max().getAsInt());
    }
}