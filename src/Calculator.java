import BasicCalculator.SimpleCalculator;

public class Calculator {
    public static void main(String[] args) {

        SimpleCalculator simpleCalcumation = new SimpleCalculator();

        simpleCalcumation.setFirstNumber(12.00);
        System.out.println("FIRST NUMBER" + " = " + simpleCalcumation.getFirstNumber());
        simpleCalcumation.setSecondNumber(12.00);
        System.out.println("SECOND NUMBER" + " = " + simpleCalcumation.getSecondNumber());
        System.out.println("TOTAL NUMBER" + "  = " + simpleCalcumation.getAdditionResult());

        simpleCalcumation.setFirstNumber(12.00);
        System.out.println("FIRST NUMBER" + " = " + simpleCalcumation.getFirstNumber());
        simpleCalcumation.setSecondNumber(6.00);
        System.out.println("SECOND NUMBER" + " = " + simpleCalcumation.getSecondNumber());
        System.out.println("TOTAL NUMBER" + "  = " + simpleCalcumation.getSubtractionResult());

        simpleCalcumation.setFirstNumber(12.00);
        System.out.println("FIRST NUMBER" + " = " + simpleCalcumation.getFirstNumber());
        simpleCalcumation.setSecondNumber(10.00);
        System.out.println("SECOND NUMBER" + " = " + simpleCalcumation.getSecondNumber());
        System.out.println("TOTAL NUMBER" + "  = " + simpleCalcumation.getDivisonResult());

        simpleCalcumation.setFirstNumber(12.00);
        System.out.println("FIRST NUMBER" + " = " + simpleCalcumation.getFirstNumber());
        simpleCalcumation.setSecondNumber(10.00);
        System.out.println("SECOND NUMBER" + " = " + simpleCalcumation.getSecondNumber());
        System.out.println("TOTAL NUMBER" + "  = " + simpleCalcumation.getMultiplicationResult());
    }
}
