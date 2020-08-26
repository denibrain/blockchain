import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        String m = scanner.next();
        while (m.length() < 4) {
            m = "0" + m;
        }
        String rev = "" + m.charAt(3) + m.charAt(2);
        System.out.println(m.substring(0, 2).equals(rev) ? "1" : "37");
    }
}