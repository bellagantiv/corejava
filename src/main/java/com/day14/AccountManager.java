package com.day14;

import java.util.Scanner;

public class AccountManager {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        AccountService service = new AccountService();
        while (true){
            System.out.println("1.Create 2.Deposit 3.Withdraw 4.Show Details 5.Show All accounts 6.Exit");
            int ch = sc.nextInt();
            switch (ch){
                case 1:
                    sc.nextLine();
                    System.out.println("Enter the name :");
                    String name = sc.nextLine();
                    System.out.println("Enter the balance :");
                    float balance = sc.nextInt();
                    service.createAccount(name,balance);
                    break;
                    case 2:
                        System.out.println("Enter the ac number :");
                        int accNumber = sc.nextInt();
                        System.out.println("Enter the depsit amount :");
                        float depositAmount = sc.nextFloat();
                        service.deposit(accNumber,depositAmount);
                    break;
                    case 3:
                        System.out.println("Enter the acc number :");
                        int withdrawAccnumber = sc.nextInt();
                        System.out.println(" Enter the withdraw amount :");
                        float withdrawAccamount  = sc.nextFloat();
                        service.deposit(withdrawAccnumber,withdrawAccamount);
                    break;
                    case 4:
                        System.out.println("Enter the acc number :");
                        int displayAccnumber = sc.nextInt();
                        service.showDetails(displayAccnumber);
                    break;
                case 5:
                    service.showAllAccountDetails();
                    case 6:
                        System.out.println("Thank you for using HDFC application");
                        System.exit(0);
                default:
                    System.out.println("please enter valid input (1-5) anly");
            }
            System.out.println("Do you want to continue, enter 1 to continue ");
            int choice = sc.nextInt();
            if (choice!=1){
                break;
            }

        }
    }
}
