/*
6.	Middle Characters
        You will receive a single string. Write a method that prints the middle character. If the length of the string is even, there are two middle characters

*/


import java.util.Scanner;

public class MiddleCharacters_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text1 = scanner.nextLine();

       PrintMidleChar(text1);
    }
    public static void PrintMidleChar(String text){
       //nechetna daljina opechatva sredniq simvol
        if(text.length()%2!=0){
        int indexOfMidleCharakter = text.length()/2;
            System.out.println(text.charAt(indexOfMidleCharakter));
        } else {
            int indexOfMidlechar1= text.length()/2-1;
            int indexOfMidleChar2 = text.length()/2;
            System.out.print(text.charAt(indexOfMidlechar1));
            System.out.print(text.charAt(indexOfMidleChar2));
        }
    }//END PrintMidleChar
}//END MainClass
