/*
Write a method that receives two numbers and an operator,
        calculates the result, and returns it. You will be given three lines of input.
        The first will be the first number, the second one will be the operator, and the last one
        will be the second number. The possible operators are: / * + -
        Print the result rounded up to the second decimal point.
        Hint
        Read the inputs and create a method that returns a double (the result of the operation):

*/


import java.util.Scanner;

public class MathOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = Integer.parseInt(scanner.nextLine());
       // char symbol = scanner.nextLine().charAt(0); //For Test Other Methode
        String operatorScan = scanner.nextLine();
        int b = Integer.parseInt(scanner.nextLine());
        System.out.println((int)calculate(a,operatorScan,b)); //Call Method and convert von Double to Integer
    }

    public static double calculate (int firstnummer , String operator, int secondNummer){
        double res = 0.0;
        switch (operator){
            case "+":
                res=firstnummer+secondNummer;
                break;
            case "-": res=firstnummer-secondNummer;
            break;
            case "*": res=firstnummer*secondNummer;
            break;
            case "/": res=firstnummer/secondNummer;
            break;

        }return res;
    }
}
