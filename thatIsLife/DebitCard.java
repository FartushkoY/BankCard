package de.telran.thatIsLife;

import java.math.BigDecimal;

public class DebitCard extends Card {

    private String ownerName;

    private BigDecimal balance;
    private String pin;

    public DebitCard(String ownerName, BigDecimal balance) {
        this.ownerName = ownerName;
        this.balance = balance;
        pin = "0000";
    }

    @Override
    public void withdraw(BigDecimal sumWithdraw) {
        if (sumWithdraw.compareTo(balance) <= 0) {
            balance = balance.subtract(sumWithdraw);
        }
    }

    @Override
    public String toString() {
        return "DebitCard{" +
                "ownerName='" + ownerName + '\'' +
                ", balance=" + balance +
                '}';
    }

    @Override
    public BigDecimal getBalance() {
        return balance;
    }

    @Override
    public void setBalance(BigDecimal balance) {
        this.balance = balance;
    }

    @Override
    public String getPin() {
        return pin;
    }
}
