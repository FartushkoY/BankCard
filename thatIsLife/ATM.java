package de.telran.thatIsLife;

import java.math.BigDecimal;

public class ATM {
    private Card card;


    public void setCard(Card card) {
        this.card = card;
    }


    public void makeOperation(Card card, Operations operation, BigDecimal sum) {
        switch (operation) {
            case ADD_BALANCE -> card.addBalance(sum);
            case WITHDRAW -> card.withdraw(sum);
        }
    }

    public BigDecimal getBalance(Card card, Operations operation) {
        BigDecimal result = new BigDecimal(0);
        switch (operation) {
            case GET_BALANCE -> {
                result = card.getBalance();
            }
            case GET_BALANCE_IN_USD -> {
                result = card.getBalanceUSD();
            }
        } return result;
    }

    public void getInfo(Card card) {
        System.out.println(card);
    }


    public void finishProcess() {
        setCard(null);
    }

}


