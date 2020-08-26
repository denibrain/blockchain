
import java.util.Scanner;

public class Main {
    private static class TableEntry<T> {
        private final int key;
        private final T value;

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

            table[idx] = new TableEntry<>(key, value);
            return true;
        }

        public T get(int key) {
            // put your code here
            int idx = findKey(key);
            if (idx == -1) {
                return null;
            }

            if (table[idx] == null) return null;
            return (T)table[idx].getValue();
        }

        public String[] entrySet() {
            // put your code here
            int len = 0;
            for(int i = 0; i < size; i++) {
                if (table[i] != null) len++;
            }
            String[] list = new String[len];
            len = 0;
            for(int i = 0; i < size; i++) {
                if (table[i] != null) {
                    list[len] = table[i].getKey() + ": " + table[i].getValue();
                    len++;
                }
            }
            return list;
        }

        private int findKey(int key) {
            // put your code here
            int hash = key % size;
            while (!(table[hash] == null || table[hash].getKey() == key)) {
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
    }

    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        // write your code here
        HashTable<String> table = new HashTable<>(10);

        int k = scanner.nextInt();
        for (int i = 0; i < k; i++) {
            int key = scanner.nextInt();
            String value = scanner.next();
            String inTable = table.get(key);
            if (inTable == null) {
                table.put(key, value);
            } else {
                table.put(key, inTable + " " + value);
            }
        }
        String[] list = table.entrySet();
        for (String s : list) {
            System.out.println(s);
        }
    }
}