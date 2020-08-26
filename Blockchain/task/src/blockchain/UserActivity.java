package blockchain;

import java.util.Random;

public class UserActivity implements Runnable {

    private final User user;
    private final MoneySystem moneySystem;
    private final Blockchain blockchain;

    public UserActivity(User user, Blockchain blockchain, MoneySystem moneySystem) {
        this.blockchain = blockchain;
        this.user = user;
        this.moneySystem = moneySystem;
    }

    @Override
    public void run() {
        Random r = new Random();

        while (blockchain.getActiveMining()) {
            String recipient = selectRecipient();
            int amount = r.nextInt(100) + 1;
            Transaction t = user.sendMoney(recipient, amount);
            if (t == null) {
                continue;
            }
            blockchain.addTransaction(t);
            try {
                Thread.sleep(r.nextInt(1000) + 500);
            } catch (InterruptedException e) {
                break;
            }
        }
    }

    private String selectRecipient() {
        Random r = new Random();
        String[] list = moneySystem.getAccountNames();
        int n = 5;
        while (n-- > 0) {
            String guess = list[r.nextInt(list.length)];
            if (!guess.equals(user.getName())) {
                return guess;
            }
        }
        return user.getName();
    }
}