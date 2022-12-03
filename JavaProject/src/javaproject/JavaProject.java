package javaproject;

import java.util.Scanner;
import java.util.Random;

public class JavaProject {

    public static void main(String[] args) {
        String Fullname, type;
        double interest, balance;
        int accNum;
        int choice = 1;
        int i =0;
        BankAccount[] account = new BankAccount[50];
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        do{
            System.out.println("=== ABC BANK MAIN MENU ===");
            System.out.print("\nSelect : \n 1. Create Account\n 2. Transaction \n Choose (0 to exit the program): ");
            choice = scanner.nextInt();
                
                if (choice == 1){
                    System.out.println("=[Create Account]=");
                    System.out.print("\nSelect: \n 1. Saving Account \n 2. Current Account\n Choose (0 to exit the program):");
                    choice = scanner.nextInt();
                    scanner.nextLine();
                    if (choice == 1){
                        System.out.println("Enter your Full name : ");
                        Fullname = scanner.nextLine();
                        
                        accNum = random.nextInt(9999 - 1001 + 1) + 1001;
                        account[i] = new SavingAccount(Fullname,"Saving Account",accNum);
                        System.out.println(account[i]);
                        i++;
                    } else if (choice == 2){
                        System.out.println("Enter your Full name : ");
                        Fullname = scanner.nextLine();
                        
                        accNum = random.nextInt(9999 - 1001 + 1) + 1001;
                        account[i] = new CurrentAccount(Fullname,"Current Account",accNum);
                        System.out.println(account[i]);
                        i++;
                    }
                } else if (choice ==2 ){
                    System.out.println("=[Transaction]=");
                    System.out.print("\nSelect: \n 1. Display \n 2. Deposit \n 3. Withdraw \n 4. Transfer\n Choose (0 to exit the program):");
                    choice = scanner.nextInt();
                }
            
        
        }while (choice != 0);

    }

}

class BankAccount {

    protected final String bankname = "ABC BANK";
    protected String Fullname, type;
    protected double interest, balance;
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

class SavingAccount extends BankAccount {

    public SavingAccount() {
    }

    public SavingAccount(String Fullname, String type, int accNum) {
        super(Fullname, type, accNum);
        balance = 50;
        interest = 0.05;
    }

}

class CurrentAccount extends BankAccount {

    public CurrentAccount() {
    }

    public CurrentAccount(String Fullname, String type, int accNum) {
        super(Fullname, type, accNum);
        balance = 200;
        interest = 0.01;
    }

}
