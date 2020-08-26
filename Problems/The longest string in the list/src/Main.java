import java.util.*;

public class Main {

    static void changeList(List<String> list) {
        // write your code here
        String found = "";
        for (String s: list
             ) {
            if (found.length() < s.length()) {
                found = s;
            }
        }
        final String replacement = found;
        list.replaceAll(x -> replacement);
    }

    /* Do not change code below */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        List<String> lst = Arrays.asList(s.split(" "));
        changeList(lst);
        lst.forEach(e -> System.out.print(e + " "));
    }
}