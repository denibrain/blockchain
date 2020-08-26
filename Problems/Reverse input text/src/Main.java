import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.Reader;

class Main {
    public static void main(String[] args) throws Exception {
        String s = "";
        try (Reader reader = new BufferedReader(new InputStreamReader(System.in))) {
            // start coding here
            int z = reader.read();
            while (z>30) {
                s = (char)z + s;
                z = reader.read();
            }
        }
        System.out.print(s);
    }
}