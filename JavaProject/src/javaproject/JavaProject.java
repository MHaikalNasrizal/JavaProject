
package javaproject;

import java.util.Scanner;
import java.util.Random;
public class JavaProject {

    
    public static void main(String[] args) {
        
                
    }
    
}

class BankAccount{
    protected final String bankname = "ABC BANK";
    protected String Fullname, type;
    protected double interest,balance;
    protected int accNum;

    public BankAccount() {
        Fullname = "Unknown";
        type = "Unknown";
        balance = 0.0;
        interest = 0.0;
        accNum = 0;
        
    }

    public BankAccount(String Fullname, String type, int accNum) {
        this.Fullname = Fullname;
        this.type = type;
        balance = 0.0;
        interest = 0.0;
        this.accNum = accNum;
    }
    

    public String getFullname() {
        return Fullname;
    }

    public void setFullname(String Fullname) {
        this.Fullname = Fullname;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public double getInterest() {
        return interest;
    }

    public void setInterest(double interest) {
        this.interest = interest;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public int getAccNum() {
        return accNum;
    }

    public void setAccNum(int accNum) {
        this.accNum = accNum;
    }

    
    public String toString() {
        return "BankAccount{" + "bankname=" + bankname + ", Fullname=" + Fullname + ", type=" + type + ", interest=" + interest + ", balance=" + balance + ", accNum=" + accNum + '}';
    }
    
    
}

class SavingAccount extends BankAccount{

    public SavingAccount() {
    }

    public SavingAccount(String Fullname, String type, int accNum) {
        super(Fullname, type, accNum);
        balance = 50;
        interest = 0.05;
    }

    

}

class CurrrentAccount extends BankAccount{

    public CurrrentAccount() {
    }

    public CurrrentAccount(String Fullname, String type, int accNum) {
        super(Fullname, type, accNum);
        balance = 200;
        interest = 0.01;
    }

    
    

}
