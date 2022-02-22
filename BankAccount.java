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
public class BankAccount {
    
   double balance;
   private int id;    


    
    
     public BankAccount (int Id, double initialBalance){
     balance = initialBalance;
     id = Id;
}
     
     
       public int getId(){
       return id; 
       }
     public void setId(){
         this.id=id;
}  
       
     public double getBalance(){
     return balance;     
     }

 public void setBalance(double balance){
     this.balance= balance;
}

public String toString() {
return "Account Id: " + id + " \t Balance: " + balance;
}
}
 

