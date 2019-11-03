package ComplexNumber;

import javax.swing.*;

public class ComplexNumber {
    private double real;
    private double imaginary;
    private double add;

    public ComplexNumber()
    {

    }

    public ComplexNumber(double real, double imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }

    public double getReal() {
        return real;
    }

    public double getImaginary() {
        return imaginary;
    }

    public  ComplexNumber Add(ComplexNumber c1, ComplexNumber c2) {
        ComplexNumber temp = new ComplexNumber(0, 0);
        temp.real = c1.real + c2.real;
        temp.imaginary = c1.imaginary + c2.imaginary;
        return temp;
    }
    public  ComplexNumber Sub(ComplexNumber c1, ComplexNumber c2) {
        ComplexNumber temp = new ComplexNumber(0, 0);
        temp.real = c1.real - c2.real;
        temp.imaginary = c1.imaginary - c2.imaginary;
        return temp;
    }
}
