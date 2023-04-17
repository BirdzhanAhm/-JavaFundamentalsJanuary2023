/*
1.	Sign of Integer
        Create a method that prints the sign of an integer number.

*/

import java.util.Scanner;

public class SignOfIntegerNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = Integer.parseInt(scanner.nextLine());
        numerSign(a);

    }
//One method sign one intiger nummber
    public static void numerSign(int b){
        if (b > 0) {
            System.out.printf("The number %d is positive.",b);
        }else if (b<0){
            System.out.printf("The number %d is negative.",b);
        }else{
            System.out.printf("The number %d is zero.",b);
        }

    }
}
