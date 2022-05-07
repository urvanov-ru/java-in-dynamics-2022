package ru.urvanov.javaindynamics2022.multithreading;

public class AccountWithDeadlock {
    private final int id;
    private int amount;

    public AccountWithDeadlock(int id) {
        this.id = id;
    }

    public int getId() {
        return this.id;
    }


    public int getAmount() {
        return this.amount;
    }

    public synchronized void transfer(
            AccountWithDeadlock fromAccount, int transferSum) {
        synchronized (fromAccount) {
            fromAccount.amount -= transferSum;
            this.amount += transferSum;
        }
    }
}

