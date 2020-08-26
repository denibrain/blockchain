import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int k = 1;
        while (k * k <= a){
            System.out.println(k * k);
            k++;
        }
    }
}