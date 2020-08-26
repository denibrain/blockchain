class Singleton {
    // write your code here
    private Singleton() {

    }

    private static final Singleton instance = new Singleton();

    public static Singleton getInstance() {
        return instance;
    }
}