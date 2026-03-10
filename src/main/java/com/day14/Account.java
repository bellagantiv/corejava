package com.day14;

public class Account {
    private int accNumber;
    private String name;
    private float balance;
    private static String bankName = "HDFC";

    public Account(String name, float balance){
        this.accNumber = AccNumberGenerator.getNewAccNumber();
        this.name = name;
        this.balance = balance;
    }

    public float withdraw(float amount){
        if(balance >= amount){
            this.balance -= amount;
        }else{
            System.out.println("Sorry! you dont't have enough finds");
        }
        return balance;

    }
    public float deposit(float amount){
        this.balance +=amount;
        return this.balance;
    }
    public void shoeDetails(){
        System.out.println(String.format("%s,%s,%S.%s",accNumber,name,bankName,balance));
    }

    public int getAccNumber() {
        return accNumber;
    }


}
