package blockchain;

import java.security.*;

public class User {

    private final String name;
    private final MoneySystem moneySystem;
    private final PublicKey publicKey;
    private final PrivateKey privateKey;

    public User(String name, MoneySystem moneySystem) throws NoSuchProviderException, NoSuchAlgorithmException {
        this.name = name;
        this.moneySystem = moneySystem;

        KeyPair keyPair = createKeyPair();
        privateKey = keyPair.getPrivate();
        publicKey = keyPair.getPublic();
    }

    public static KeyPair createKeyPair() throws NoSuchAlgorithmException, NoSuchProviderException {
        KeyPairGenerator keyGen = KeyPairGenerator.getInstance("RSA");

        SecureRandom random = SecureRandom.getInstance("SHA1PRNG", "SUN");
        keyGen.initialize(1024, random);

        return keyGen.generateKeyPair();
    }

    private TransactionSignature signText(String text)
            throws NoSuchAlgorithmException, InvalidKeyException, SignatureException {
        Signature rsa = Signature.getInstance("SHA1withRSA");
        rsa.initSign(privateKey);
        rsa.update(text.getBytes());
        return new TransactionSignature(rsa.sign(), publicKey);
    }

    public Transaction sendMoney(String to, int amount) {
        return moneySystem.sendMoney(this.name, to, amount, text -> {
            try {
                return signText(text);
            } catch (NoSuchAlgorithmException | InvalidKeyException | SignatureException e) {
                e.printStackTrace();
                return null;
            }
        });
    }

    public String getName() {
        return name;
    }
}
