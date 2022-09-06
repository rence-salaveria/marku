package Main;

import Exceptions.InsufficientFundsException;

public class Main {
    public static void main(String[] args) {
        checkAccount();
    }

    private static void checkAccount() {
        CheckAccount c = new CheckAccount(500);
        c.showBalance();
        System.out.println("Depositing 200 credits");
        c.deposit(200);
        c.showBalance();

        try {
            System.out.println("Try to withdraw $600");
            c.withdraw(600);
            c.showBalance();
            c.withdraw(1000);
        } catch (InsufficientFundsException e) {
            System.out.printf("Sorry you need %.2f to complete that transaction", e.getLackingAmount());
        }
    }
}
