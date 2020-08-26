public class Main {

    public static void main(String[] args) {

        // create instances and start threads here
        WorkerThread w1 = new WorkerThread();
        w1.setName("worker-1");
        WorkerThread w2 = new WorkerThread();
        w2.setName("worker-2");
        w1.start();
        w2.start();
    }
}

// Don't change the code below
class WorkerThread extends Thread {

    private static final int numberOfLines = 3;

    @Override
    public void run() {
        final String name = Thread.currentThread().getName();

        if (!name.startsWith("worker-")) {
            return;
        }

        for (int i = 0; i < numberOfLines; i++) {
            System.out.println("do something...");
        }
    }
}