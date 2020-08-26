package blockchain;

public class Account {

    private String name;
    private int amount;

    public Account(String name, int initialAccount) {
        this.amount = initialAccount;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public boolean canAfford(int amount) {
        return this.amount >= amount;
    }
}
