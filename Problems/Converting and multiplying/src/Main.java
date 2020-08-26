import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        File f = new File("/data/projects/denibrain/Blockchain/Problems/Converting and multiplying/src/file1.txt");

        Scanner scanner = null;
        try {
            scanner = new Scanner(f);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            return;
        }
        long n = 0;
        while (scanner.hasNext()) {
            n += scanner.nextLong();
        }
        System.out.print(n);
    }
}