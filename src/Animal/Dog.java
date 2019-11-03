package Animal;



public class Dog extends Animal {
private int eyes;
private int legs;
private int tails;
private int teeth;

    public Dog(String name, int age, double weight, String size, int eyes, int legs, int tails, int teeth) {
        super(name, age, weight, size);
        this.eyes = eyes;
        this.legs = legs;
        this.tails = tails;
        this.teeth = teeth;
    }
}
