package bankapp;

import java.io.Serializable;


public abstract class Account  implements Serializable{
    private double balance = 0;
    private double interest = 0.02;
    private int accountNumber;
    private static int numberOfAccounts = 1000000;
    private double transactionFee;
    private double LoanAmt;
    private int timep;
    private double roi;
    
    Account(){
        accountNumber = getNextAccountNumber();
    }
    
    public static int getNextAccountNumber(){
        return ++numberOfAccounts;
    }
    
    public abstract String getAccountType();
    
    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
    public void setLoanAmount(double LoanAmt) {
        this.LoanAmt=LoanAmt;
    }
    public void setTimePeriod(int timep) {
        this.timep=timep;
    }

    public double getInterest() {
        return interest;
    }

    public void setInterest(double roi) {
        this.roi= roi;
    }

    public int getAccountNumber() {
        return accountNumber;
    }
    
   public void withdraw(double amount) throws InsufficientFundsException{
        String tmp=getAccountType();
        if(tmp.equals("Checking"))
        {
            if(amount  > balance+5000.0){
            throw new InsufficientFundsException();
             }
            else
            {
                    balance=balance-amount;    
            }
        }
        
        else{
            if(amount  > balance){
            throw new InsufficientFundsException();
             }
            else
            {
                    balance=balance-amount;    
            }   
        }
    }
    
    public void deposit(double amount) throws InvalidAmountException{
        if(amount <= 0){
            throw new InvalidAmountException();
        }
        balance += amount;
    }
    public double Calcroi(double LAmt,double roi,int timep){
        LAmt+=(LAmt*roi)/100;
        LAmt=LAmt/timep;
        return LAmt;
    }
    public double checkInterest(double LAmt,double roi,int timep){
    LAmt=(LAmt*roi)/100;
    return LAmt;
    }
    public double getTransactionFee() {
        return transactionFee;
    }
    
    public void setTransactionFee(double fee){
        this.transactionFee = fee;
    }

    void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }
}
