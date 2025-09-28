/*PS:Design a Bank class with private fields: accountNumber, userName, and balance.
Include methods to deposit money, withdraw money (only if the balance is sufficient), 
and display account information. Ensure all fields are accessible only via getters and setters.*/
package OOPS.Encapsulation.Basics;

public class Bank {
    private String userName;
    private int accId;
    private double balance;
    void setUserName(String userName){
        this.userName= userName;
    }
    void setAccId(int accId){
        this.accId=accId;
    }
    void setBalance(double balance){
        this.balance= balance;
    }
    String getUserName(){
        return userName;
    }
    int getAccId(){
        return accId;
    }
    double getBalance(){
        return balance;
    }
    double withdraw(double amount){
        if (amount > balance) {
            System.out.println("Insufficent Balance");
        }
        else{
            balance=balance-amount;
        }
        return balance;
    }
    void display(){
        System.out.println("Customer Name:"+ userName);
        System.out.println("Customer ID:"+ accId);
        System.out.println("Balance:"+ balance);
    }
}
class Test{
    public static void main(String[] args) {
        Bank b1= new Bank();
        b1.setUserName("Aditya");
        b1.setAccId(1234);
        b1.setBalance(5000.0d);
        b1.display();
        b1.withdraw(2000);
        b1.display();

    }
}