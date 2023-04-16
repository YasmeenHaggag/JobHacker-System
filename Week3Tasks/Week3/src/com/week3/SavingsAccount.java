package com.week3;

public class SavingsAccount extends Account {
    double interestRate,interestBalance;
    public void calInterestBalance(){
        interestBalance=balance*interestRate;
    }

}
