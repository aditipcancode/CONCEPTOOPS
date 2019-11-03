package Person;


public class Person {
       private String name;
       private Brain brain;
    public Person() {
        System.out.println("CONSTRUCTOR RUNNING");
    }

    public Person(String name) {
        this.name=name;
        //System.out.println(name);
        Brain brain=new Brain();
    }

    public void wrtname()
    {
        System.out.println(this.name);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}


