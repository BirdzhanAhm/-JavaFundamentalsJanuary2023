/*
3.	Characters in Range
        Write a method that receives two characters and prints all the characters in between them on a single line according to ASCII.

*/

import java.util.Scanner;

public class CharactersinRange {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char symbol = scanner.nextLine().charAt(0);
        char symbol2 = scanner.nextLine().charAt(0);
        int b =(char)symbol2;
        int c=(char)symbol;
        //System.out.println(c); //chek char to Int ASCII code
       // System.out.println(b);
        printAllCharackterBetTwoChar(symbol,symbol2);

    }

    public static void printAllCharackterBetTwoChar(char ch1, char ch2){
        int intigerChar1 = (char) ch1;
        int intigerChar2=(char) ch2;

        if (intigerChar1 <= intigerChar2) {
            for (int i = intigerChar1+1; i <intigerChar2 ; i++) {
                System.out.print((char)i +" ");

            }

        }else {
            for (int i = intigerChar2+1; i <intigerChar1 ; i++) {
                System.out.print((char)i +" ");
            }
        }
        
    }
}

