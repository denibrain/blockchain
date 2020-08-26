//put imports you need here

import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        String[] lines = new String[5];
        for (int i = 0; i < lines.length; i += 1) {
            lines[i] = scanner.nextLine();
        }

        System.out.print("The form for ");
        System.out.print(lines[0]);
        System.out.print(" is completed. We will contact you if we need a chef that cooks ");
        System.out.print(lines[4] + " dishes.");
    }
}