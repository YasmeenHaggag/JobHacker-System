package com.week3;

public class Account {
    int accountNumber;
    String accountHolderName;
    double balance;
    public Account(){
        accountNumber=0000;
        accountHolderName="";
        balance=0.0;
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
