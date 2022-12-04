package javaproject;

import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.Random;

public class JavaProject {

    public static void main(String[] args)  {
        
        String Fullname;
        double balance;
        int accNum;
        int choice = 1;
        int i = 0;
        int j = 0;
        BankAccount[] account = new BankAccount[50];
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        do {

            System.out.println("\n=== ABC BANK MAIN MENU ===");
            System.out.print("\nSelect : \n 1. Create Account\n 2. Transaction \n Choose (0 to exit the program): ");
            try{
            choice = scanner.nextInt();
            }catch(InputMismatchException e){
                
                System.out.println("the input is not a number");
                scanner.next();
                break;
            }
            if (choice == 1) {
                System.out.println("\n=[Create Account]=");
                System.out.print("\nSelect: \n 1. Saving Account \n 2. Current Account\n Choose (0 to exit the program):");
                choice = scanner.nextInt();
                scanner.nextLine();
                if (choice == 1) {

                    System.out.println("Enter your Full name : ");
                    Fullname = scanner.nextLine();

                    accNum = random.nextInt(9999 - 1001 + 1) + 1001;
                    account[j] = new SavingAccount(Fullname, "Saving Account", accNum);
                    System.out.println(account[j]);
                    j++;

                } else if (choice == 2) {

                    System.out.println("Enter your Full name : ");
                    Fullname = scanner.nextLine();

                    accNum = random.nextInt(9999 - 1001 + 1) + 1001;
                    account[j] = new CurrentAccount(Fullname, "Current Account", accNum);
                    System.out.println(account[j]);
                    j++;

                }

            } else if (choice == 2) {
                System.out.println("=[Transaction]=");
                System.out.print("\nSelect: \n 1. Display \n 2. Deposit \n 3. Withdraw \n 4. Transfer\n Choose (0 to exit the program):");
                choice = scanner.nextInt();
                switch (choice) {
                    case 1:
                        try{
                        System.out.print("To Display account Detail Please Enter Account Number : ");
                        accNum = scanner.nextInt();
                        
                        for (i = 0; i < account.length; i++) {
                            if (account[i].getAccNum() == accNum) {
                                System.out.println(account[i]);
                                break;
                            }

                        }
                        }catch(NullPointerException e){
                            System.out.println("Invalid Account Number");
                        }catch(InputMismatchException e){
                            
                            System.out.println("the input is not a number");
                            scanner.next();
                            
                        }
                        break;

                    case 2:
                        System.out.print("[Deposit]Please Enter Account Number : ");
                        try{
                        accNum = scanner.nextInt();
                        
                        for (i = 0; i < account.length; i++) {
                            
                            if (accNum == account[i].accNum) {
                                System.out.println("Current Balance : RM " + account[i].getBalance());
                                System.out.print("Deposit : RM ");
                                balance = scanner.nextDouble();
                                if (balance <= 0){
                                    throw new ArithmeticException();
                                }
                                balance = balance + account[i].getBalance();
                                account[i].setBalance(balance);
                                System.out.println("[Sucessful]New Balance : RM " + account[i].getBalance());
                                break;

                            }
                            
                            
                        }
                        }catch(NullPointerException e){
                            System.out.println("Deposit Unsuccessful : Account does not exist");
                        }catch(InputMismatchException e){
                            
                            System.out.println("Deposit Unsuccessful : the input is not a number");
                            scanner.next();
                        }catch(ArithmeticException e){
                            System.out.println("Deposit Unsuccessful : Given amount is less than or equals to zero");
                            
                        }
                        break;
                    case 3:
                        System.out.print("[Withdraw]Please Enter Account Number : ");
                        try{
                        accNum = scanner.nextInt();
                        
                        for (i = 0; i < account.length; i++) {
                            if (accNum == account[i].accNum) {
                                System.out.println("Current Balance : RM " + account[i].getBalance());
                                System.out.print("Withdraw : RM ");
                                balance = scanner.nextDouble();
                                if(balance > account[i].getBalance()){
                                    throw new Exception();
                                }
                                if (balance <= 0){
                                    throw new ArithmeticException();
                                }
                                balance = account[i].getBalance() - balance;
                                account[i].setBalance(balance);
                                System.out.println("[Sucessful]New Balance : RM" + account[i].getBalance());
                                break;

                            }

                        }
                        }catch(NullPointerException e){
                            System.out.println("Withdraw Unsuccessful : Account does not exist");
                        }catch(InputMismatchException e){
                            
                            System.out.println("Withdraw Unsuccessful : the input is not a number");
                            scanner.next();
                        }catch(ArithmeticException e){
                            System.out.println("Withdraw Unsuccessful : Given amount is less than or equals to zero");
                            
                        }catch(Exception e){
                            System.out.println("Transfer Unsuccessful : the withdrawn balance is " +
                            "greater than the current balance");
                        }
                        break;
                    case 4:
                        System.out.print("[Transfer]Please Enter Account Number : ");
                        try{
                        accNum = scanner.nextInt();
                        
                        for (i = 0; i < account.length; i++) {
                            if (accNum == account[i].accNum) {
                                System.out.println("Current Balance : RM " + account[i].getBalance());
                                System.out.print("Amount to transfer : RM ");
                                balance = scanner.nextDouble();
                                double send = balance;
                                String sender = account[i].getFullname();
                                if(balance > account[i].getBalance()){
                                    throw new Exception();
                                }
                                if (balance <= 0){
                                    throw new ArithmeticException();
                                }
                                balance = account[i].getBalance() - balance;
                                account[i].setBalance(balance);
                                System.out.print("[Transfer]Please Enter receiver Account Number : ");
                                accNum = scanner.nextInt();
                                for (i = 0; i < account.length; i++) {
                                    if (accNum == account[i].accNum) {
                                        balance = account[i].getBalance() + send;
                                        account[i].setBalance(balance);
                                        System.out.println("[Sucessful] ===Receipt===");
                                        System.out.println("Sender name = " + sender);
                                        System.out.println("Total Receive = " + send);
                                        System.out.println("Account Number = " + account[i].getAccNum());
                                        break;
                                    }
                                }break;
                            }
                         
                        }
                        }catch(NullPointerException e){
                            System.out.println("Transfer Unsuccessful : Account does not exist");
                        }catch(InputMismatchException e){
                            
                            System.out.println("Transfer Unsuccessful : the input is not a number");
                            scanner.next();
                        }catch(ArithmeticException e){
                            System.out.println("Transfer Unsuccessful : Given amount is less than or equals to zero");
                            
                        }catch(Exception e){
                            System.out.println("Transfer Unsuccessful : the withdrawn balance is " +
                            "greater than the current balance");
                        }
                        break;
                    default:
                        break;
                }
            }

        } while (choice != 0);

    }
  

}

abstract class BankAccount {

    protected final String bankname = "ABC BANK";
    protected String Fullname, type;
    protected double interest, balance;
    protected int accNum;

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
        return "\n[BankAccount]" + "\nbankname=" + bankname + ", \nFullname=" + Fullname +
                ", \ntype=" + type + ", \ninterest=" + interest + ", \nbalance=" + balance + ", \naccNum=" + accNum+"\n" ;
    }

}

class SavingAccount extends BankAccount {

    public SavingAccount(String Fullname, String type, int accNum) {
        super(Fullname, type, accNum);
        balance = 50;
        interest = 0.05;
    }

}

class CurrentAccount extends BankAccount {

    public CurrentAccount(String Fullname, String type, int accNum) {
        super(Fullname, type, accNum);
        balance = 200;
        interest = 0.01;
    }

}
