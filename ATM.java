/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg1213atmlab;

/**
 *
 * @author emray
 */
public class ATM{
    
    private BankAccount account;
    public ATM(BankAccount b){
       
        account = b;
    }
   
    //part1 withdrawl
    public void withdraw(double amount){
        
        if(amount > 0 && amount <= account.getBalance()){
            //valid
        account.setBalance((account.getBalance() - amount));
        System.out.println("Thanks, your new balance is: " + account.getBalance());
        //insufficient funds
    }else {
            System.out.println("Withdraw canceled, amount must be greater than 0. " + account.getBalance());
        }
        
        
        //part 2 deposit
        
    }    
    
    public void deposit(double amount){
        
        
        if(amount > 0){
            //valid
            account.setBalance(amount + account.getBalance());
            System.out.println("Deposit successful, New Balance is: " + account.getBalance());
          
        }else
            //invalid
     System.out.println("Deposit cancelled, amount must be greater than 0");
             }
    public double getBalance() {
          
        return account.getBalance();
        
    }
        
        
        
        //part 3
        public void setAccount(BankAccount b) {
          if(b== null) {
              System.out.println("The BankAccount object cannot be null");
          }else {
              account = b;
                
          }
          
      }
      
      public String getAccountInformation() {
          return "Account ID: " + account.getId() + " Account balance: " + account.getBalance();
      }
      
      
     
    
}
    
        
        
        
        
        
      
    
    
    
    
   
   
