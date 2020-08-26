//put imports you need here

import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        String[] lines = new String[3];
        lines[2] = scanner.nextLine();
        lines[1] = scanner.nextLine();
        lines[0] = scanner.nextLine();
        for (int i = 0; i < lines.length; i+=1) {
            System.out.println(lines[i]);
        }
    }
}