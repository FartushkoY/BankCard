package de.telran.thatIsLife;

import java.math.BigDecimal;

public class Card {
    private String ownerName;
    private BigDecimal balance;


    public Card(String ownerName, BigDecimal balance) {
        this.ownerName = ownerName;
        this.balance = balance;
    }


    public void addBalance(BigDecimal sumRecharge) {
        balance = balance.add(sumRecharge);
    }


    public void withdraw(BigDecimal sumWithdraw) {
        balance = balance.subtract(sumWithdraw);
    }


    public BigDecimal getBalanceUSD() {
        BigDecimal balanceUSD = balance.multiply(BigDecimal.valueOf(1.09));
        return balanceUSD;
    }


    @Override
    public String toString() {
        return "Card{" +
                "ownerName='" + ownerName + '\'' +
                ", balance=" + balance +
                '}';
    }


    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public BigDecimal getBalance() {
        return balance;
    }

}
