class SimpleCounter {
    // write your code here
    private SimpleCounter() {}

    public int counter;

    private static SimpleCounter instance = new SimpleCounter();

    public static SimpleCounter getInstance() {
        return instance;
    }
}