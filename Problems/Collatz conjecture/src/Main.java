import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        while (a != 1){
            System.out.print(a + " ");
            if (a % 2 == 1) {
                a=a*3+1;
            } else {
                a/=2;
            }
        }
        System.out.print(1);
    }
}