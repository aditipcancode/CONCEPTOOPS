public class TestInterface {
    public static void main(String[] args) {
        Animal a = new Animal();
a.GetlegCount();
        System.out.println(a.GetlegCount());
    }
}

interface iAnimal {
    int legcount = 4;

    public boolean CanMove();

    public boolean CanEat();

    public boolean Hasleg();

    public boolean HasTail();

    public int GetlegCount();
}

class Animal implements iAnimal {

    @Override
    public boolean CanMove() {
        return false;
    }

    @Override
    public boolean CanEat() {
        return false;
    }

    @Override
    public boolean Hasleg() {
        return false;
    }

    @Override
    public boolean HasTail() {
        return false;
    }

    @Override
    public int GetlegCount() {
     //   legcount=10;
        return legcount;
    }
}
