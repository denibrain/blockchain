package blockchain;

import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Collectors;

public class Blockchain {

    private final int blockCost;
    private int zeroHashLength = 0;
    private boolean activeMining = true;
    private String prevHash = "0";
    private long startedAt = System.currentTimeMillis();
    private final ArrayList<Transaction> transactions = new ArrayList<>(50);
    private long timeGenerated;

    private final User systemUser;

    ArrayList<Block> chains = new ArrayList<>(50);
    private final int maxChainLength;

    public Blockchain(int maxChainLength, int blockCost, User systemUser) {
        this.blockCost = blockCost;
        this.maxChainLength = maxChainLength;
        this.systemUser = systemUser;
    }

    @Contract(pure = true)
    private boolean isValid(@NotNull Block b) {
        return prevHash.equals(b.getPreviousHash());
    }

    public synchronized boolean getActiveMining() {
        return activeMining;
    }

    public synchronized void addBlock(Block block) {
        if (!isValid(block)) {
            return;
        }
        chains.add(block);
        Transaction[] saved = getAndCleanSavedTransactions(block);
        Transaction t = systemUser.sendMoney(block.getMinerName(), blockCost);
        if (t == null) {
            return;
        }
        addTransaction(t);

        String transactionAsText = Arrays.stream(saved)
                .map(Transaction::getAsMessage)
                .collect(Collectors.joining("\n"));

        String nStatus = adjustZeroLength();
        System.out.println("Block:\n" +
                "Created by: " + block.getMinerName() + "\n" +
                block.getMinerName() + " gets " + blockCost + " VC\n" +
                "Id: " + chains.size() + "\n" +
                "Timestamp: " + block.getTime() + "\n" +
                "Magic number: " + block.getMagic() + "\n" +
                "Hash of the previous block: \n" +
                prevHash + "\n" +
                "Hash of the block: \n" +
                block.getHash() + "\n" +
                "Block data: " + (saved.length == 0
                ? "\nNo transactions"
                : "\n" + transactionAsText) + "\n" +
                "Block was generating for " + timeGenerated + " seconds\n" +
                "N " + nStatus + "\n");

        prevHash = block.getHash();

        if (chains.size() >= maxChainLength) {
            activeMining = false;
        }
    }

    private Transaction[] getAndCleanSavedTransactions(Block block) {
        Transaction[] blockContent = block.getContent();
        transactions.removeIf(t -> Arrays.stream(blockContent).anyMatch(e -> e.getId() == t.getId()));
        return blockContent;
    }

    private String adjustZeroLength() {
        long newTime = System.currentTimeMillis();
        long milliseconds = (newTime - startedAt);
        timeGenerated = milliseconds / 1000;
        startedAt = newTime;

        if (milliseconds < 250) {
            zeroHashLength++;
            return "was increased to " + zeroHashLength;
        } else if (milliseconds > 500 && zeroHashLength > 0) {
            zeroHashLength--;
            return "was decreased to " + zeroHashLength;
        }
        return "stay the same";
    }

    public synchronized int getZeroHashLength() {
        return zeroHashLength;
    }

    public synchronized int getSerialNo() {
        return chains.size();
    }

    public synchronized Transaction[] getContent() {
        return transactions.stream().filter(t -> t.getTime() - startedAt < 500).toArray(Transaction[]::new);
    }

    public synchronized void addTransaction(Transaction t) {
        transactions.add(t);
    }

    public synchronized String getLastBlockHash() {
        return prevHash;
    }
}
