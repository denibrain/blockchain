import java.util.*;

public class Main {
    public static void main(String[] args) {
        // write your code here
        Scanner scanner = new Scanner(System.in);
        String s = scanner.next();
        int n = 0;
        int k = 0;
        int t = 0;
        final String vows = "aeiouyy";

        for (char c: s.toCharArray()) {
            int nt = vows.indexOf(c) == -1 ? 0 : 1;
            if (k == 0) {
                t = nt;
                k++;
            } else {
                if (nt == t) {
                    k++;
                    if (k >= 3) {
                        n++;
                        k=1;
                    }
                } else {
                    k = 1;
                    t = nt;
                }
            }
        }
        System.out.print(n);
    }
}