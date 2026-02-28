package com.day9;

import java.util.List;

public class AccountManager {

    public static void main(String[] args){

        Account acc1 = new Account("1001030201","vikas",5000);
        acc1.showDetails();
        acc1.deposit(205000);
        acc1.withdraw(5000);
        acc1.showDetails();
        System.out.println("-".repeat(80));
        Account acc2 = new Account("1001030201","vikas",5000);
        acc2.showDetails();
        acc2.deposit(35000);
        acc2.withdraw(4500);
        acc2.showDetails();
        System.out.println("-".repeat(80));
        Account acc3 = new Account("1001030201","vikas",5000);
        acc3.showDetails();
        acc3.deposit(45000);
        acc3.withdraw(23500);
        acc3.showDetails();

        List<Account>list = List.of(acc1,acc2,acc3);
        double totalBalance = 0;
        for (Account acc :list){
            totalBalance += acc.balance;
        }
        double maxAmount = list.get(0).balance;
        for (Account acc:list){
            if (maxAmount < acc.balance){
                maxAmount = acc.balance;
            }
        }
        System.out.println("max balance customer detaisl: (max amount is" +maxAmount +")");
        for (Account acc:list){
            if(acc.balance == maxAmount){
                acc.showDetails();
                System.out.println(".".repeat(200));
            }
        }

    }
}
