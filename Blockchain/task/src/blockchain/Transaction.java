package blockchain;

public class Transaction {

    private final int id;
    private final String sender;
    private final String receiver;
    private final long time;
    private TransactionSignature signature;
    private final int amount;

    public Transaction(int id, String sender, String receiver, int amount) {
        this.id = id;
        this.sender = sender;
        this.receiver = receiver;
        this.amount = amount;
        this.time = System.currentTimeMillis();
    }

    public String getAsMessage() {
        return sender + " sent " + amount + " VC to " + receiver;
    }

    public TransactionSignature getSignature() {
        return signature;
    }

    public void setSignature(TransactionSignature signature) {
        this.signature = signature;
    }

    public int getId() {
        return id;
    }

    public long getTime() {
        return time;
    }
}

