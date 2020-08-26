import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        List<String> words = Arrays.stream(scanner.nextLine().split(" ")).collect(Collectors.toList());
        List<String> note = Arrays.stream(scanner.nextLine().split(" ")).collect(Collectors.toList());
        for (String w : note
        ) {
            if (words.contains(w)) {
                words.remove(w);
            } else {
                System.out.println("You are busted");
                return;
            }
        }

        System.out.println("You get money");
    }
}