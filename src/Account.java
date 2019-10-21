import Bankaccount.BankAccount;
import Bankaccount.VIPPERSON;


public class Account {
    public static void main(String[] args) {
        BankAccount aditi = new BankAccount();

        aditi.setAccountnumber(123454321);
        aditi.setBalance(0.0);
        aditi.setCustomername("Aditi");
        aditi.setEmail("adipri@gmail.com");
        aditi.setPhone(1234567980);

        aditi.depositFund(50.00);
        aditi.withdrawFund(100.00);
        System.out.println("CUSTOMER NAME" + "=" + aditi.getCustomername() + " " + "EMAIL ID " + "=" + aditi.getEmail() + " " + "PHONE NUMBER" + "=" + aditi.getPhone() + " " + "ACCOUNT NUMBER" + "=" + aditi.getAccountnumber() + " " + "BALANCE IN ACCOUNT" + "=" + aditi.getBalance());

        VIPPERSON person = new VIPPERSON();
        System.out.println(person.getName()+person.getEmail()+person.getCreditLimit());

        VIPPERSON person1=new VIPPERSON("CBA",100,"CBA@GMAIL.COM");
        System.out.println(person1.getName()+person1.getCreditLimit()+person1.getEmail());

        VIPPERSON person2=new VIPPERSON("xyz",80);
        System.out.println(person2.getCreditLimit()+","+person2.getName()+","+person2.getEmail());



    }
}
