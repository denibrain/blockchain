import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        while (a !=0){
            System.out.println(a % 2 == 1 ? "odd" : "even");
            a = scanner.nextInt();
        }
    }
}