package Bankaccount;

public class BankAccount {
    private int Accountnumber;
    private double Balance;
    private String Customername;
    private int Phone;
    private String Email;
    double depositFund;
    double withdrawFund;


    public void depositFund(double depositFund) {
        this.Balance += depositFund;
        System.out.println(depositFund);
    }

    public void withdrawFund(double withdrawFund) {
        if (Balance - withdrawFund < 0) {
            System.out.println("NOT ENOUGH BALANCE");
        } else {
            System.out.println(Balance - withdrawFund);
        }
    }

    public void setAccountnumber(int Accountnumber) {
        this.Accountnumber = Accountnumber;
    }

    public int getAccountnumber() {
        return this.Accountnumber;
    }

    public void setBalance(double Balance) {
        this.Balance = Balance;
    }

    public double getBalance() {
        return this.Balance;
    }

    public void setCustomername(String Customername) {
        this.Customername = Customername;
    }

    public String getCustomername() {
        return this.Customername;
    }

    public void setPhone(int Phone) {
        this.Phone = Phone;
    }

    public int getPhone() {
        return this.Phone;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    public String getEmail() {
        return this.Email;
    }

}
