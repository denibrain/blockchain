package blockchain;

import java.security.*;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class Main {

    public static void main(String[] args) throws InterruptedException, NoSuchProviderException, NoSuchAlgorithmException {
        int poolSize = 12;
        ExecutorService executor = Executors.newFixedThreadPool(poolSize);

        MoneySystem moneySystem = new MoneySystem();
        User systemUser = moneySystem.createAccount("System", 10000);

        Blockchain blockchain = new Blockchain(15, 100, systemUser);

        String[] names = {"Nick", "Bob", "Alice"};
        for(String userName: names) {
            User u = moneySystem.createAccount(userName, 100);
            UserActivity activity = new UserActivity(u, blockchain, moneySystem);
            executor.submit(activity);
        }

        for(int i = 0; i < poolSize - 3; i++) {
            String minerName = "miner" + (i+1);
            moneySystem.createAccount(minerName, 100);
            Miner miner = new Miner(blockchain, minerName);
            executor.submit(miner);
        }

        executor.shutdown();
        executor.awaitTermination(300, TimeUnit.SECONDS);
    }
}

