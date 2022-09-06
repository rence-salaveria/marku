package Exceptions;


public class InsufficientFundsException extends Exception {
    // Custom Exception class
    // Exception class should extend 'Exception' class 
    private final double amount;

    public InsufficientFundsException(double amount) {
        this.amount = amount;
    }

    public double getLackingAmount() {
        return amount;
    }
}
