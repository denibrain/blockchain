import java.util.*;

public class Main {
    public static void main(String[] args) {
        // write your code here
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] income = new int[n];
        int no = 0;
        double m = -1;
        for(int i = 0; i < n; i++) {
            income[i] = scanner.nextInt();
        }
        for(int i = 0; i < n; i++) {
            int taxes = scanner.nextInt();
            double companyTaxes = (double)income[i] * taxes / 100;
            if (m < companyTaxes) {
                no = i+1;
                m = companyTaxes;
            }
        }
        System.out.print(no);
    }
}