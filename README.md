# JavaProject

Question 
Write a java program using OOP concepts (including data members with their suitable 
modifier, constructer, and setter and getter methods) to create a new user bank account, print 
a user account info (of the same bank: ABC BANK) including bank name, full name, account 
number, account type (current or saving), and interest rate (initial interest rate 0.0), balance 
(initial balance 0.0), or display transaction status with the updated balance. Your program 
should have at least two classes and two sub-classes. One class is BankAccount which 
involves all constructors and methods to create or process a user account, and two subclasses 
SavingAccount and CurrentAccount with overridden initial balance and interest rate methods, 
for SavingAccount the initial balance is RM50 and the interest rate is 0.05% and for 
CurrentAccount the initial balance is RM200, and the interest rate is 0.01%. Another class is 
Main to process and display the account info including transaction status using toString
method. There are four types of transactions, display, deposit, withdraw, and transfer.
Your program should first ask the user to choose from a main menu to create an account, 
make a transaction, or end the program by inserting the value 0. To create an account (when 
you test, you should create at least one account for each type to test the transfer method, you
may use array of objects), the user needs to choose the account type and give his/her full 
name, then the program randomly assigns an account number that is supposed to be four 
digits between (1001-9999), assume the program will not randomly generate same account 
number. 
After the account is created, the program will display the created account info including user 
name, account number, and account type, the program then will display the user's main menu 
again. If the user opts to make a transaction, another menu will be displayed to the user to 
choose between Display, Deposit, Withdraw and Transfer. If the option is Display, the 
program then displays the user’s account info including balance and interest rate after the 
user has inserted his/her account number. Otherwise. the user needs to insert the amount if 
selected Deposit or Withdraw, or insert the amount, sender name, and receiver account 
number if selected Transfer, the program then displays the transaction status (Successful or 
Unsuccessful), and the updated balance or the reason for being unsuccessful (e.g. if the given 
amount is less than or equals to zero, the input is not a number, the withdrawn balance is 
greater than the current balance, or the amount is transferred to account does not exist), to do 
so, apply Exception to ensure valid input. After that, the program will display the user's main 
menu again, to exit insert Zero
