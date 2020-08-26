import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int k = 0;
        while (a !=0){
            k+=a;
            if (k >= 1000) {
                k-=1000;
                break;
            }
            a = scanner.nextInt();
        }
        System.out.println(k);
    }
}