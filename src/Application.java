import Person.Person;

public class Application {
    public static void main(String[] args) {
        System.out.println("HELLO WORLD");
        Person person=new Person("Aditi");

        person.getName();
        person.setName(person.getName()+" "+"priya");
        person.wrtname();
    }
}
