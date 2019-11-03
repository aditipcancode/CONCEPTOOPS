package Animal;


public class CallingAnimal {
    public static void main(String[] args) {
      Animal animal=new Animal("Tommy",1,6.0,"Medium");

      Dog dog=new Dog("Zimmy",2,4,"Small",2,2,1,10);
        dog.eat();
      dog.move();
    }
}
