import java.util.Scanner;

class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();

        StringReverser reverser = new StringReverser() {
            @Override
            public String reverse(String str) {
                if (str.length() < 1) return str;
                String rev ="";
                for (int i = 0; i < str.length(); i++ ) {
                    rev += str.charAt(str.length() - i - 1);
                }
                return rev;
            }
        };/* create an instance of an anonymous class here,
                                     do not forget ; on the end */

        System.out.println(reverser.reverse(line));
    }

    interface StringReverser {

        String reverse(String str);
    }

}