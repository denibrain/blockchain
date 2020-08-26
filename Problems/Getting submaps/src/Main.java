import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        TreeMap<Integer, String> map = new TreeMap<>();
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int n = scanner.nextInt();
        while (n-- > 0) {
            Integer i = scanner.nextInt();
            String v = scanner.nextLine();
            map.put(i, v);
        }
        map.subMap(a, b + 1).forEach((k,v) -> System.out.println(k  + v));
    }
}