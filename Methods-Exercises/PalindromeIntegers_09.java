/*
9.	Palindrome Integers
        A palindrome is a number that reads the same backward as forward,
        such as 323 or 1001. Write a program that reads a positive integer number
        until you receive "END". For each numbered print, whether the number is palindrome or not.
*/


import java.util.Scanner;

public class PalindromeIntegers_09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String command = scanner.nextLine();
        while (!command.equals("END")){
            if (ChekPolindromeText(command)){
                System.out.println("true");
            }
            else {
                System.out.println("false");

            }
            command=scanner.nextLine();
        }
    }

    public static boolean ChekPolindromeText(String text){
        //String originalText= text;
        String reverseText="";
        for (int i=text.length()-1;i>=0;i--){
            reverseText+=text.charAt(i);
        }
        return text.equals(reverseText);
    }

}
