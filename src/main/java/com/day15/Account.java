package com.day15;

public class Account {
    Long accNumber;
    String name;
    double balance;

    public Account(Long accNumber, String name, double balance) {
        this.accNumber = accNumber;
        this.name = name;
        this.balance = balance;
    }

    public double withdraw(double amount){
        if(balance >= amount){
            this.balance -= amount;
        }else{
            System.out.println("Sorry! you dont't have enough finds");
        }
        return balance;

    }
    public double deposit(double amount){
        this.balance +=amount;
        return this.balance;
    }
    public void shoeDetails(){
        System.out.println(String.format("%s,%s,%S",accNumber,name,balance));
    }

    public Long getAccNumber() {
        return accNumber;
    }


}
