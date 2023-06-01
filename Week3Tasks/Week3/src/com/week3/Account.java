package com.week3;

public class Account {
    private long accountNumber;
    private String accountHolderName;
    private double balance;
    public Account(){
        accountNumber=0000;
        this.accountHolderName="";
        balance=0.0;
    }
    public double GetBalance(){
        return balance;
    }
    public void withdraw(double withdrawed){
        if(withdrawed>balance)
            System.out.println("U can’t");
        else
            balance-=withdrawed;
    }
    public void deposit(double deposited){
        balance+=deposited;
    }
}
