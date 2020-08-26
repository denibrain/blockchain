import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        String[] list = scanner.nextLine().split(" ");
        int n = scanner.nextInt() % list.length;
        for(int i = 0; i < list.length; i++) {
            if (i > 0) {
                System.out.print(" ");
            }
            System.out.print(list[(list.length - n + i) % list.length]);
        }
    }
}