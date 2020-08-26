import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        String s = scanner.next();
        char last = 0;
        boolean asc = true;
        for(char a: s.toCharArray()) {
            if (last == 0) {
                last = a;
            } else if (last != a - 1) {
                asc = false;
                break;
            }
            last = a;
        }
        System.out.println(asc);
    }
}