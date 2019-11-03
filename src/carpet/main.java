package carpet;

public class main {

    public static void main(String[] args) {

        Carpet carpet = new Carpet(3.5);
        Floor floor = new Floor(2.75, 4.0);
        calculator Calculator = new calculator(floor, carpet);
        System.out.println("Total cost =" + Calculator.getTotalCost());

         carpet = new Carpet(1.5);
         floor = new Floor(5.4, 4.5);
         Calculator = new calculator(floor, carpet);
        //System.out.println("Total cost =" + Calculator.getTotalCost());
    }
}
