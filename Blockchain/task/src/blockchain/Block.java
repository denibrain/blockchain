package blockchain;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;

public class Block
{
    private Transaction[] content;
    private long magic;
    private final long time;
    private final String prevHash;
    private final String minerName;

    private transient String hash;

    public Block(String prevHash, String minerName) {
        this.prevHash = prevHash;
        time =  new Date().getTime();
        this.content = null;
        this.minerName = minerName;
    }

    public String getMinerName() {
        return minerName;
    }

    private String getTransactionsAsString() {
        return Arrays.toString(content);
    }

    public String toString() {
        return getTransactionsAsString() + magic + time + prevHash + minerName;
    }

    public long getMagic() {
        return magic;
    }

    public void setMagic(long magic) {
        this.magic = magic;
    }

    public long getTime() {
        return time;
    }

    public String getHash() {
        return this.hash;
    }

    public String getPreviousHash() {
        return prevHash;
    }

    public Transaction[] getContent() {
        return content;
    }

    public void setContent(Transaction[] c) {
        content = c;
    }

    public void setHash(String hash) {
        this.hash = hash;
    }
}