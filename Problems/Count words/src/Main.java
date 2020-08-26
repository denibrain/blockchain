import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.Reader;

class Main {
    public static void main(String[] args) throws Exception {
        int n = 0;
        boolean a = true;
        try (Reader reader = new BufferedReader(new InputStreamReader(System.in))) {
            // start coding here
            int z = reader.read();
            while (z>30) {
                if (z!=32) {
                    if (a) {
                        n++;
                        a = false;
                    }
                } else if (z==32) {
                    a = true;
                }
                z = reader.read();
            }
        }
        System.out.print(n);
    }

}