import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        for(String s: scanner.nextLine().split("")) {
            System.out.print(s  + s);
        }
    }
}