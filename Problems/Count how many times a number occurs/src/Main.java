import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int[] nums = new int[n];
        for(int i = 0; i<n; i++) {
            nums[i] =  scanner.nextInt();
        }
        int k = scanner.nextInt();
        int m = 0;
        for(int a: nums) {
            if (a==k) {
                m++;
            }
        }

        System.out.println(m);
    }
}