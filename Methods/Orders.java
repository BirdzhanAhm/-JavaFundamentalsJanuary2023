/*
Write a method that calculates the total price of an order and prints it on the console.
 The method should receive one of the following products: coffee, water, coke, snacks,
 and a quantity of the product. The prices for a single piece of each product are:
        •	coffee – 1.50
        •	water – 1.00
        •	coke – 1.40
        •	snacks – 2.00
        Print the result rounded to the second decimal place.
        Hint
        •	Read the product and the quantity.
        •	Create a method the pass the two variables in.
        •	Print the result in the method
*/


import java.util.Scanner;

public class Orders {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String product_name = scanner.nextLine();
        int count = Integer.parseInt(scanner.nextLine());
        calculateOrder(product_name,count);



    }
    public static void calculateOrder(String nameP, double c){
        double sum= 0.0;
        switch (nameP){
            case  "coffee":
                sum=c*1.5;
                break;
            case "water":
                sum=c*1.0;
                break;
            case "coke":
                sum=c*1.4;
                break;
            case "snacks":
                sum=c*2.0;
                break;
        }
        System.out.printf("%.2f",sum);

    }
}
