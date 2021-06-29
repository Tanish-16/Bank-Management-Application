package bankapp;


public class Loan extends Account {
    private static String accountType = "Loan";
    
    Loan(double LoanAmt, double roi, int timep){
        this.setLoanAmount(LoanAmt);
        this.setInterest(roi);
        this.setTimePeriod(timep);
    }
    @Override
    public String toString(){
        return "Account Type: " + accountType + " Account\n" +
                "Account Number: " + this.getAccountNumber() + "\n" +
                "Balance: " + this.getBalance() + "\n" + 
                "Interest Rate: " + (this.getInterest() * 100) + "%\n";
    }

    @Override
    public String getAccountType() {
        return accountType;
    }
}
