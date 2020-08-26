import java.util.*;

public class Main {
    public static void main(String[] args) {
        // write your code here
        Scanner scanner = new Scanner(System.in);
        int height = scanner.nextInt();
        int n = scanner.nextInt();
        int bridgeNo = 0;
        for(int i = 0; i < n; i++) {
            if (height >= scanner.nextInt()) {
                bridgeNo = i + 1;
                break;
            }
        }
        System.out.print(bridgeNo == 0 ? "Will not crash" : "Will crash on bridge " + bridgeNo);
    }
}