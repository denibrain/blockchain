//put imports you need here

import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        String[] lines = new String[8];
        for (int i = 0; i < lines.length; i += 1) {
            lines[i] = scanner.next();
        }

        for (int i =  lines.length - 1; i >= 0; i -= 1) {
            System.out.println(lines[i]);
        }
    }
}