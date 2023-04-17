/*
9.	Greater of Two Values
        You are given two values of the same type as input. The values can be of type int, char of String. Create a method getMax() that returns the greater of the two values:
        Hints
        1.	You need to create three methods with the same name and different signatures for this method.
        2.	Create a method that will compare integers:
        3.	Create a second method with the same name, which will compare characters. Follow the logic of the previous method:
        4.	Lastly, you need to create a method to compare strings. This is a bit different as strings don't allow to be compared with the operators ">" and "<":
        You need to use the method "compareTo()", which returns an integer value (greater than zero if the compared object is greater, less than zero if the compared object is lesser, and zero if the two objects are equal).
        5.	The last step is to read the input. Use appropriate variables and call the getMax() from your main().
*/

import java.util.Scanner;

public class GreaterOfTwoValues {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String typeOfDate = scanner.nextLine();
        switch (typeOfDate){
            case "int":
                int firsIntiger = Integer.parseInt(scanner.nextLine());
                int secondInteger = Integer.parseInt(scanner.nextLine());
                System.out.println(getMax(firsIntiger,secondInteger));
                break;
            case "char":
                char symbol1 = scanner.nextLine().charAt(0);
                char symbol2 = scanner.nextLine().charAt(0);
                System.out.println(getMax(symbol1,symbol2));
                break;
            case "string":
                String fString = scanner.nextLine();
                String sString = scanner.nextLine();
                System.out.println(getMax(fString,sString));
                break;
        }

    }
    static int getMax(int a, int b){
        if (a >b) {
            return a;
        }else {return b;}
    }

    static char getMax(char a, char b){
        if(a>b){
            return a;
        }else {return b;}
    }
    static String getMax(String a, String b){
        if(a.compareTo(b)>0){
            return a;
        }else {return b;}
    }
}
