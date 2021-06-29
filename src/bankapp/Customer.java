package bankapp;

import java.io.Serializable;

public class Customer  implements Serializable{
    private final String firstName;
    private final String lastName;
    private final String ssn;
    private final Account account;
    private final String LoanType;
    private final double LAmt;
    private final double roi;
    private final int timep;

    Customer(String firstName, String lastName, String ssn, Account account, String LoanType, double LAmt, double roi, int timep) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.ssn = ssn;
        this.account = account;
        this.LoanType=LoanType;
        this.LAmt=LAmt;
        this.roi=roi;
        this.timep=timep;
    }
    
    @Override
    public String toString(){
        return "\nCustomer Information\n" +
                "First Name: " + getFirstName() + "\n" + 
                "Last Name: " + getLastName() +  "\n" + 
                "SSN: " + getSsn() +  "\n" + 
                account;
    }
    
    public String basicInfo(){
        return " Account Number: " + account.getAccountNumber() + " - Name: " + getFirstName() + " " + getLastName();
    }
    
    Account getAccount(){
        return account;
    }

    public String getFirstName() {
        return firstName;
    }

    /**
     * @return the lastName
     */
    public String getLastName() {
        return lastName;
    }


    public String getSsn() {
        return ssn;
    }
    public String LoanType() {
        return LoanType;
    }
    public double LAmt() {
        return LAmt;
    }
    public double roi() {
        return roi;
    }
    public int timep() {
        return timep;
    }
}
