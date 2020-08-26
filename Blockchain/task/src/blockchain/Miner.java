package blockchain;

public class Miner implements Runnable {

    private final Blockchain blockchain;
    private final String name;

    public Miner(Blockchain blockchain, String name) {
        this.blockchain = blockchain;
        this.name = name;
    }

    @Override
    public void run() {
        while (blockchain.getActiveMining()) {
            Block block = generateBlock();
            if (block != null) {
                blockchain.addBlock(block);
            }
        }
    }

    private Block generateBlock() {
        int lastNo = blockchain.getSerialNo();
        int zeroLength = blockchain.getZeroHashLength();
        Block b = new Block(blockchain.getLastBlockHash(), name);
        do {
            b.setMagic(b.getMagic() + 1);
            b.setContent(blockchain.getContent());
            String hash = HashGenerator.applySha256(b.toString());
            if (hashProved(hash, zeroLength)) {
                b.setHash(hash);
                return b;
            }
        }
        while(lastNo == blockchain.getSerialNo());
        return null;
    }

    private boolean hashProved(String hash, int zeroLength) {
        for(int k = 0; k < zeroLength; k++) {
            if (hash.charAt(k) != '0') {
                return false;
            }
        }
        return true;
    }
}
