import DetailOfPerson.Person.Person;

public class PersonDetails {
    public static void main(String[] args) {

        Person person = new Person();

        person.setFirstName("ADITI");
        person.setLastName("PRIYA");
        person.setAge(19);
        System.out.println(person.getFirstName() + "," + person.getLastName() + "," + person.getAge());


        person.setFirstName("ADI");
        person.setLastName("PRI");
        person.setAge(-19);
        System.out.println(person.getFirstName() + "," + person.getLastName() + "," + person.getAge());

        person.setFirstName("A");
        person.setLastName("P");
        person.setAge(12);
        System.out.println(person.getFirstName() + "," + person.getLastName() + "," + person.isTeen());

        person.setFirstName("ADITI");
        person.setLastName("PRIYA");
        person.setAge(19);
        System.out.println(person.getFirstName() + "," + person.getLastName() + "," + person.isTeen());

        person.setFirstName("");
        person.setLastName("PRIYA");
        person.setAge(19);
        System.out.println(person.getFullName() + person.getFirstName() + "," + person.getLastName() + "," + person.isTeen() + "," + person.getAge());
    }
}
