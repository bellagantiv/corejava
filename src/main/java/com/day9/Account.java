package com.day9;

import java.time.LocalDateTime;

public class Account {

        String accNum;
        String name;
        double balance;
        String sci;


    public Account(String accNum, String name, double balance){
      this.accNum= accNum;
      this.name = name;
      this.balance = balance;
    }

    public Account(String accNum,String name,double balance, String sci){
        this(accNum,name,balance);
        this.sci = sci;
    }

    public void deposit(double amount){
        balance += amount;
        System.out.println("hi your account" +maskAccnumber( accNum) +"id debited with ammount" + amount+" on " + " abd balance " + balance);
    }
    public void withdraw(double amount){
        if(balance >= amount){
            balance -= amount;
            System.out.println("hi your account" +maskAccnumber( accNum) +"id debited with ammount" + amount+" on " +" and balace "+ balance);
        }else {
            System.out.println("you dont have sufficent funds. you balance is :"+ balance);
        }
    }





    public void showDetails(){
            System.out.println("Account number :"+maskAccnumber( accNum));
            System.out.println("Name           :"+name);
            System.out.println("Balance        :"+ balance);
        }

        private  String maskAccnumber(String accNum) {
         if(accNum!=null && accNum.length() > 4){
             return "*******"+accNum.substring(accNum.length()-4);
         }
         return  accNum;
        }

}

