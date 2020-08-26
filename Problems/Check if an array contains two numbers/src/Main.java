import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        int k = scanner.nextInt();
        int[] a = new int[k];
        while(k-- > 0) a[k] = scanner.nextInt();
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int d = 0;
        for(int i: a) {
            if (i == n || i==m) {
                d++;
                if  (d==2)
                    break;
                else
                    continue;
            }
            d = 0;
        }
        System.out.println(d == 2);
    }
}