package blockchain;

import java.security.PublicKey;

public class TransactionSignature {

    private byte[] signature;
    private PublicKey publicKey;

    public TransactionSignature(byte[] signature, PublicKey publicKey) {
        this.signature = signature;
        this.publicKey = publicKey;
    }

    public byte[] getSignature() {
        return signature;
    }

    public PublicKey getPublicKey() {
        return publicKey;
    }
}
