package blockchain;

import javax.management.openmbean.KeyAlreadyExistsException;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;

public class MoneySystem {

    private final Map<String, Account> accounts;
    private int currentTransactionId = 0;

    public MoneySystem() {
        accounts = new HashMap<>();
    }

    public User createAccount(String name, int initialAmount) throws NoSuchProviderException, NoSuchAlgorithmException {
        if (accounts.containsKey(name)) {
            throw new KeyAlreadyExistsException(name);
        }
        accounts.put(name, new Account(name, initialAmount));
        return new User(name, this);
    }

    public boolean canAfford(String sender, int amount) {
        Account account = findAccount(sender);
        return account.canAfford(amount);
    }

    public Account findAccount(String name) {
        if (accounts.containsKey(name)) {
            return accounts.get(name);
        }

        throw new IndexOutOfBoundsException(name);
    }

    public synchronized String[] getAccountNames() {
        return accounts.keySet().toArray(String[]::new);
    }

    public Transaction sendMoney(String sender, String recipient, int amount,
                             Function<String, TransactionSignature> singTransaction) {
        if (!canAfford(sender, amount)) {
            return null;
        }
        findAccount(recipient);
        Transaction t = new Transaction(++currentTransactionId, sender, recipient, amount);
        TransactionSignature s = singTransaction.apply(t.getAsMessage());
        if (s == null) {
            return null;
        }

        t.setSignature(s);
        return t;
    }
}
