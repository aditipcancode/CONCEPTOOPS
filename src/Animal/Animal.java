package Animal;


public class Animal {
    private String name;
    private int age;
    private double weight;
    private String size;

    public Animal(String name, int age, double weight, String size) {
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.size = size;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public double getWeight() {
        return weight;
    }

    public String getSize() {
        return size;
    }

    public void eat() {
        System.out.println();
    }

    public void move() {
        System.out.println();
    }
}

