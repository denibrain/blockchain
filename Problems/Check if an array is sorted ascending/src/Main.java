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
        boolean correct = true;
        for(int a = 1; a < nums.length; a++) {
            if (nums[a-1] > nums[a]) {
                correct = false;
                break;
            }
        }

        System.out.println(correct);
    }
}