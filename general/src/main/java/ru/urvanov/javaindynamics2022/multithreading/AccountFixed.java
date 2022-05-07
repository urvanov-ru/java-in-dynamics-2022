package ru.urvanov.javaindynamics2022.multithreading;



public class AccountFixed {
    private final int id;
    private int amount;

    public AccountFixed(int id) {
        this.id = id;
    }

    public int getId() {
        return this.id;
    }


    public int getAmount() {
        return this.amount;
    }

    public void transfer(AccountFixed fromAccount, int transferSum) {
        AccountFixed firstBlock;
        AccountFixed secondBlock;
        if (this.id < fromAccount.id) {
            firstBlock = this;
            secondBlock = fromAccount;
        } else {
            firstBlock = fromAccount;
            secondBlock = this;
        }

        synchronized (firstBlock) {
            synchronized (secondBlock) {
                fromAccount.amount -= transferSum;
                this.amount += transferSum;
            }
        }

    }
}
