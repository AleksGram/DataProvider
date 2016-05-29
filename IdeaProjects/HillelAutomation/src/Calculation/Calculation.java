package Calculation;

import java.util.Scanner;
/**
 * Created by Грам on 25.05.2016.
 */
public class Calculation {
    private double number1;
    private double number2;
    private double result;

    public Calculation() {
    }
    Scanner sc = new Scanner(System.in);

    public double getNumber1() {
        return number1;
    }

    public void setNumber1(double n1) {
        this.number1 = n1;
    }

    public double getNumber2() {
        return number2;
    }

    public void setNumber2(double n2) {
        this.number2 = n2;
    }

    public double getResult() {
        return result;
    }


    public double givNum1(){
        System.out.println("Give the first number: ");
        double n1 = sc.nextDouble();
        return n1;

    }
    public double givNum2(){
        System.out.println("Give the second number: ");
        double n2 = sc.nextDouble();
        return n2;

    }


    public double add(double number1, double number2) {
        return result = number1 + number2;
    }

    public void show() {
        System.out.println("Result = "+result);
    }

    public static void main(String args[]) {
        Calculation calc = new Calculation();

        calc.setNumber1(calc.givNum1());
        calc.setNumber2(calc.givNum2());
        calc.add(calc.getNumber1(), calc.getNumber2());
        calc.show();

    }

}