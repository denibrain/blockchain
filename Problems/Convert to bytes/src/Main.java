import java.io.InputStream;

class Main {
    public static void main(String[] args) throws Exception {
        InputStream inputStream = System.in;
        int c;
        do {
            c = inputStream.read();
            if (c>0) System.out.print(c);
        } while (c > 0);
    }
}