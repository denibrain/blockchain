import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        // write your code here
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> list = readArrayList(scanner);
        int n = scanner.nextInt();

        int[] delta = new int[list.size()];
        list.sort(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1 > o2 ? 1 : -1;
            }
        });
        int min = 0;
        for(int i= 0; i < list.size(); i++) {
            delta[i] = Math.abs(n - list.get(i));
            if (i==0) {
                min = delta[i];
            } else if (min > delta[i]) {
                min = delta[i];
            }
        }
        int k = 0;

        for(int i= 0; i < list.size(); i++) {
            if (delta[i] == min) {
                if (k > 0) System.out.print(" ");
                System.out.print(list.get(i));
                k++;
            }
        }
    }
    private static ArrayList<Integer> readArrayList(Scanner scanner) {
        return Arrays
                .stream(scanner.nextLine().split("\\s+"))
                .map(Integer::parseInt)
                .collect(Collectors.toCollection(ArrayList::new));
    }
}