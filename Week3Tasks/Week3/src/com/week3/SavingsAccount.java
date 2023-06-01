package com.week3;

public class SavingsAccount extends Account {
    private double interestRate;
    private  double interestBalance;
    public void calInterestBalance(){
        Account account=new Account();
        interestBalance=account.GetBalance()*interestRate;
    }

}
