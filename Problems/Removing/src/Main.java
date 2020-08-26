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
                rehash();
                idx = findKey(key);
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
            while(!(table[hash] == null || (table[hash].getKey() == key))) {
                hash = (hash + 1) % size;
                if (hash == key % size) {
                    return -1;
                }
            }
            return hash;
        }

        private void rehash() {
            // put your code here
            TableEntry[] oldTable = table;
            int oldSize = size;
            size *= 2;
            table = new TableEntry[size];
            for (int i = 0; i < oldSize; i++) {
                put(oldTable[i].getKey(), (T)oldTable[i].getValue());
            }
        }

        @Override
        public String toString() {
            StringBuilder tableStringBuilder = new StringBuilder();

            for (int i = 0; i < table.length; i++) {
                if (table[i] == null) {
                    tableStringBuilder.append(i + ": null");
                } else {
                    tableStringBuilder.append(i + ": key=" + table[i].getKey()
                                                + ", value=" + table[i].getValue()
                                                + ", removed=" + table[i].isRemoved());
                }

                if (i < table.length - 1) {
                    tableStringBuilder.append("\n");
                }
            }

            return tableStringBuilder.toString();
        }
    }

    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        int m = scanner.nextInt();
        int n = scanner.nextInt();
        HashTable<String> table = new HashTable<>(5);
        for(int i = 0; i < m; i++) {
            int key = scanner.nextInt();
            String value = scanner.next();
            table.put(key, value);
        }
        for(int i = 0; i < n; i++) {
            int key = scanner.nextInt();
            table.remove(key);
        }
        System.out.println(table);
    }
}