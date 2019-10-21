package Bankaccount;

public class VIPPERSON {
        private String Name;
        private double CreditLimit;
        private String Email;

    public VIPPERSON()
    {
        this("DEFAULT",1000.00,"default@gmail.com");
    }
    public VIPPERSON(String Name,double CreditLimit)
        {
           this.Name=Name;
            this.CreditLimit=CreditLimit;
           this.Email="default@gmail.com";
        }
        public VIPPERSON(String Name,double CreditLimit,String Email)
        {
            this.Name=Name;
            this.CreditLimit=CreditLimit;
            this.Email=Email;
        }

    public String getName() {
        return Name;
    }

    public double getCreditLimit() {
        return CreditLimit;
    }

    public String getEmail() {
        return Email;
    }
}






