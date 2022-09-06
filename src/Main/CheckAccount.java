package Main;

import Exceptions.InsufficientFundsException;

public class CheckAccount {
    private double balance;

    CheckAccount(double balance) {
        this.balance = balance;
    }

    public void deposit(double amount) {
        balance += amount;
    }

    public void withdraw(double amount) throws InsufficientFundsException {
        if (balance >= amount) {
            balance -= amount;
        } else {
            double amountLacking = amount - balance;
            throw new InsufficientFundsException(amountLacking);
        }
    }

    public void showBalance() {
        System.out.println(balance);
    }
}
