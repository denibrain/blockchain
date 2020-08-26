import java.util.Scanner;

public class Main {
    private static class TableEntry<T> {
        private final int key;
        private final T value;
        private boolean removed;

        public TableEntry(int key, T value) {
            this.key = key;
            this.value = value;
        }

        public int getKey() {
            return key;
        }

        public T getValue() {
            return value;
        }

        public void remove() {
             removed = true;   
        }

        public boolean isRemoved() {
             return removed;   
        }
    }

    private static class HashTable<T> {
        private int size;
        private TableEntry[] table;

        public HashTable(int size) {
            this.size = size;
            table = new TableEntry[size];
        }

        public boolean put(int key, T value) {
            // put your code here
            int idx = findKey(key);

            if (idx == -1) {
                return false;
            }

            table[idx] = new TableEntry(key, value);
            return true;
        }

        public T get(int key) {
            // put your code here
            int idx = findKey(key);

            if (idx != -1 && table[idx] != null && !table[idx].isRemoved()) {
                return (T)table[idx].getValue();
            }

            return null;
        }

        public void remove(int key) {
            // put your code here
            int idx = findKey(key);
            if (idx == -1) {
                return;
            }

            if (table[idx] != null) {
                table[idx].remove();
            }
        }

        private int findKey(int key) {
            // put your code here
            int hash = key % size;
            while(!(table[hash] == null || (table[hash].getKey() == key || table[hash].isRemoved()))) {
                hash = (hash + 1) % size;
                if (hash == key % size) {
                    return -1;
                }
            }
            return hash;
        }
    }

    public static void main(String[] args) {
        // put your code here
        HashTable<String> table = new HashTable<>(100);
        Scanner scanner = new Scanner(System.in);
        int k = scanner.nextInt();
        for(int i = 0; i < k; i++) {
            String method = scanner.next();
            int key = scanner.nextInt();
            if (method.equals("put")) {
                String value = scanner.next();
                table.put(key, value);
            } else if (method.equals("get")) {
                String value = table.get(key);
                System.out.println(value == null ? "-1" : value);
            } else if (method.equals("remove")) {
                table.remove(key);
            }
        }
    }
}