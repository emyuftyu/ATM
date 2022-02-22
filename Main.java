/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg1213atmlab;

import java.util.Scanner;

/**
 *
 * @author emray
 */
public class Main{

    /**
     * @param args the command line arguments
     */
   
     private static BankAccount account;
    public static ATM atm;
    public static double amountWithdraw;
    public static double amountDeposit;
   
    public static void main(String[] args) {
       
        
        
        BankAccount bankAcc = new BankAccount(10212, 1021.90);
        atm = new ATM(bankAcc);
        
       printOptions(); 
        

        
    }
    
    public static void printOptions() {
        
         Scanner keyboard = new Scanner(System.in); 
         
        int choice = 0;
        
        
        System.out.println("1. Get Account Balance");
        System.out.println("2. Withdraw");
        System.out.println("3. Deposit");
        System.out.println("4. Quit");
        
        System.out.print("Please enter option (1-4): "); 
        choice = keyboard.nextInt();
        
        while(choice < 1 || choice > 4) {
        System.out.print("Selction can only be 1 - 4: ");
        choice = keyboard.nextInt();
        }
      
        handleSelection(choice);
        
        
        
    } 
    
    public static void handleSelection(int choice) {
        
        Scanner keyboard = new Scanner(System.in); 
       
        if(choice == 1) 
        {  
            System.out.println(atm.getBalance());
            
        } if(choice == 2) 
        { 
            System.out.println("How much would like to withdraw?: ");
            amountWithdraw = keyboard.nextDouble();
            atm.withdraw(amountWithdraw);
            
        } if (choice == 3) 
        {
            System.out.println("How much would like to deposit?: ");
            amountDeposit = keyboard.nextDouble();
            atm.deposit(amountDeposit);
             
        } if (choice == 4)
        {
            System.out.close();
            
        } else 
        {
            printOptions();
        }

        }

    /**
     * @return the account
     */
    public static BankAccount getAccount() {
        return account;
    }

    /**
     * @param aAccount the account to set
     */
    public static void setAccount(BankAccount aAccount) {
        account = aAccount;
    }
        
       
    }
        
    
    

