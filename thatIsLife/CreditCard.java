package de.telran.thatIsLife;

import java.math.BigDecimal;

public class CreditCard extends Card {
    private String ownerName;
    private BigDecimal balance;
    private String pin;
    private BigDecimal creditLimit;

    public CreditCard(String ownerName, BigDecimal balance, BigDecimal creditLimit) {
        this.ownerName = ownerName;
        this.balance = balance;
        this.creditLimit = creditLimit;
        pin = "1234";
    }

    @Override
    public void withdraw(BigDecimal sumWithdraw) {
        if (creditLimit.add(balance).compareTo(sumWithdraw) >= 0) {
            balance = balance.subtract(sumWithdraw);
        }
    }

    @Override
    public String toString() {
        return "CreditCard{" +
                "ownerName='" + ownerName + '\'' +
                ", balance=" + balance +
                ", creditLimit=" + creditLimit +
                '}';
    }

    @Override
    public BigDecimal getBalance() {
        return balance;
    }

    public void setBalance(BigDecimal balance) {
        this.balance = balance;
    }

}
