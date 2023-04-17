/*
8.	Math Power
        Create a method that calculates and returns the value of a number raised to a given power.
        Hints
        Create a method that will have two parameters - the number and the power, and will return a result of type double:
        Invoke the method and use DecimalFormat to print the result.
*/

import java.text.DecimalFormat;
import java.util.Scanner;

public class MathPower {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double inputA = Double.parseDouble(scanner.nextLine());
        double inputB = Double.parseDouble(scanner.nextLine());
        //System.out.printf("%.4f",mathPowCalcolate(inputA,inputB));
        System.out.println(new DecimalFormat("0.####").format(mathPowCalcolate(inputA,inputB)));

    }

    public static double mathPowCalcolate(double a, double b){
        double pow = Math.pow(a, b);
        return pow;
    }
}
