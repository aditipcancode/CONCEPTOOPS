package BasicCalculator;

public class SimpleCalculator {

    private double FirstNumber;
    private double SecondNumber;


    public void setFirstNumber(double FirstNumber) {
        this.FirstNumber = FirstNumber;
    }

    public double getFirstNumber() {

        return this.FirstNumber;
    }

    public void setSecondNumber(double SecondNumber) {

        this.SecondNumber = SecondNumber;
    }

    public double getSecondNumber() {
        return this.SecondNumber;
    }

    public double getAdditionResult() {
        return this.SecondNumber + this.FirstNumber;

    }

    public double getSubtractionResult() {

        return this.SecondNumber - this.FirstNumber;

    }

    public double getMultiplicationResult() {
        return this.SecondNumber * this.FirstNumber;


    }

    public double getDivisonResult() {
        return this.SecondNumber / this.FirstNumber;

    }
}

