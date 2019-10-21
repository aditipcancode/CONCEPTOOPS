package DetailOfPerson.Person;
public class Person {
    private String FirstName;
    private String LastName;
    private int age;

    public void setFirstName(String FirstName) {
        this.FirstName = FirstName;
    }

    public String getFirstName() {
        return this.FirstName;
    }


    public void setLastName(String LastName) {
        this.LastName = LastName;
    }

    public String getLastName() {
        return this.LastName;
    }


    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        if (age < 0 || age > 100) {
            this.age = 0;
        }
        return this.age;
    }


    public boolean isTeen() {

        if (age > 12 && age < 20) {
            return true;
        }
        return false;
    }

    public String getFullName() {
        String FullName = "";
        {
            if ((FirstName == "") && (LastName == "")) {
                return " ";
            } else if (LastName == "") {
                return this.FirstName;
            } else if (FirstName == "") {
                return this.LastName;
            }
            return FullName;
        }
    }
}
