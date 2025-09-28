/*PS: Design a BankAccount class with private fields: accountNumber, balance, and password. 
Implement deposit and withdraw methods that require the correct password for access. 
Do not provide a getter for the password. 
Bonus: Lock the account after three incorrect password attempts and prevent further operations. */
package OOPS.Encapsulation.Advance;
import java.util.Scanner;
public class BankAccount {
    Scanner sc= new Scanner(System.in);
    private int accountNumber;
    private double balance;
    private long password;
    private boolean locked=false;
    int failedAttempts=0;
    public void setAccountNo(int accountNumber){
        this.accountNumber=accountNumber;
    }
    public void setBalance(double balance){
        this.balance=balance;
    }
    public void setPassword(long password){
        this.password=password;
    }
    public int getAccountNo(){
        return accountNumber;
    }
    public double getBalance(){
        return balance;
    }
    public boolean authenticate(){
        if (locked) {
            System.out.println("Account is locked due to 3 wrong password attempts");
            return false;
        }
        else System.out.println("Enter Password:");
        long tpass=sc.nextLong();
        if (tpass==password) {
            failedAttempts=0;
            return true;
        }else{
            failedAttempts+=1;
            System.out.println("Wrong Password "+ (3-failedAttempts) +" attempts Remaining");
            if (failedAttempts==3) {
                locked=true;
                System.out.println("Account is locked");
            }
            return false;
        }        
    }
    public void withdraw(double amount){
        if (authenticate()) {
            if (amount<=balance) {                
                balance-=amount;
                System.out.println("Withdraw Success! Balance="+ balance);
            }
            
        }
    }
    public void deposit(double amount){
        if (authenticate()) {
            balance+=amount;
            System.out.println("Deposit Success! Balance="+balance);
        }
        
    }
    void display(){
        System.out.println("User Account No: "+ accountNumber);
        System.out.println("Bank Balance: "+ balance);
    }
}
class TestBankAccount{
    public static void main(String[] args) {
        BankAccount b1= new BankAccount();
        b1.setAccountNo(1234);
        b1.setBalance(5000.0d);
        b1.setPassword(369);
        b1.display();
        b1.deposit(1000);
        b1.display();
        b1.withdraw(4000.0d);
        b1.display();
        

        
    }
}
