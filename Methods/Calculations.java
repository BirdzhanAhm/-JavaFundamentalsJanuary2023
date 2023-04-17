/*
4.	Calculations
        Write a program that receives a string on the first line
        ("add", "multiply", "subtract", "divide") and on the next two
        lines receives two numbers. Create four methods (for each calculation)
        and invoke the right one depending on the command. The method should also
        print the result (it needs to be void).

*/


import java.util.Scanner;

public class Calculations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String comanda = scanner.nextLine();
        int a = Integer.parseInt(scanner.nextLine());
        int b = Integer.parseInt(scanner.nextLine());

        switch (comanda){
            case  "add":
                add(a,b);
                break;
            case "multiply":
                multiply(a,b);
                break;
            case "subtract":
                subtract(a,b);
                break;
            case "divide":
                divide(a,b);
                break;
        }

    }
    public static void add(int num1, int num2){
        System.out.println(num1+num2);
    }
    public static void multiply(int num1, int num2){
        System.out.println(num1*num2);
    }
    public static void subtract(int num1, int num2){
        System.out.println(num1-num2);
    }
    public static void divide(int num1, int num2){
        System.out.println(num1/num2);
    }
}
