package com.week3;

public class Bank extends Account {
    Account accountArray[]= new Account[Integer.MAX_VALUE];
    int i=0;
    public void addNewAccount(){
        Account account=new Account();
        accountArray[i]=account; i++;
    }
    double displayBalance(int index) {
        return accountArray[index].balance;
    }
}
