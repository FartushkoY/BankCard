package de.telran.bankCard;

import java.math.BigDecimal;

public class Card {
    private String nameOwner;
    private BigDecimal balance;

    public Card(String nameOwner, BigDecimal balance) {
        this.nameOwner = nameOwner;
        this.balance = balance;
    }

    public void addBalance(BigDecimal sumRecharge) {
        System.out.println("Your account has been funded with " + sumRecharge + " EUR");
        balance = balance.add(sumRecharge);
    }

    public void withdraw(BigDecimal sumWithdraw) {
            balance = balance.subtract(sumWithdraw);
            System.out.println("Operation successful.  Get your money: " + sumWithdraw);
    }

    public BigDecimal getBalanceUSD() {
        balance = balance.multiply(BigDecimal.valueOf(1.09));
        return balance;
    }


    @Override
    public String toString() {
        return "Card{" +
                "nameOwner='" + nameOwner + '\'' +
                ", balance=" + balance +
                '}';
    }

    public String getNameOwner() {
        return nameOwner;
    }


    public BigDecimal getBalance() {
        return balance;
    }

    public void setBalance(BigDecimal balance) {
        this.balance = balance;
    }
}
