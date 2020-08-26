import java.util.Arrays;

class AsciiCharSequence implements java.lang.CharSequence {
    private byte[] s;

    // implementation
    AsciiCharSequence(byte[] s) {
        this.s = s;
    }

    @Override
    public int length() {
        return s.length;
    }

    @Override
    public char charAt(int index) {
        return (char)s[index];
    }

    @Override
    public CharSequence subSequence(int start, int end) {
        return new AsciiCharSequence(Arrays.copyOfRange(s, start, end));
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        for(byte b: s) {
            builder.append((char)b);
        }
        return builder.toString();
    }
}