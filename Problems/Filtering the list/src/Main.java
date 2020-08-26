import java.util.*;
import java.util.stream.Collectors;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);

        List<Integer> numbers = Arrays
                .stream(scanner.nextLine().split("\\s+"))
                .map(Integer::parseInt).collect(Collectors.toList());

        if (numbers.size() < 2) {
            System.out.println();
            return;
        }

        List<Integer> result = new ArrayList<>();
        for(int i =  numbers.size() - 1; i > 0; i--) {
            if ((i & 1) == 1) {
                result.add(numbers.get(i));
            }
        }
        System.out.println(result.stream().map(Object::toString).collect(Collectors.joining(" ")));
    }
}