package com.oops.examples.Encapsulation;


import lombok.Getter;
import lombok.Setter;

public class BankAccount {

    @Setter
    @Getter
    private String accountNumber;
    @Getter
    private double balance;
//
//    public double getBalance() {
//        return balance;
//    }

//    public void setAccountNumber(String accountNumber) {
//        this.accountNumber = accountNumber;
//    }

    public void deposit(double amount) {
        if(amount <= 0) {
            throw new IllegalArgumentException("Amount must be greater than 0");
        }
        this.balance = this.balance + amount;
    }

    public boolean withdraw(double amount) {
        if(amount > this.balance) {
            System.out.println("balance is insufficient.");
            return false;
        }
        if (amount <= 0) {
            System.out.println("Withdrawal must be positive.");
            return false;
        }
        this.balance = this.balance - amount;
        return true;
    }


}
