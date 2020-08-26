// The method is OK, no need to change it
public void writeWords(String[] words) throws IOException {
    LetterPrinter printer = new LetterPrinter();

    char[] letters = convert(words);
    for (char letter : letters) {
        printer.write(letter);
    }
}

private char[] convert(String[] words) throws IOException {
    // implement the method
    CharArrayWriter w = new CharArrayWriter();
    for(String s: words) {
        w.write(s, 0, s.length());
    }
    return w.toCharArray();
}