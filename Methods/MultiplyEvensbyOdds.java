/*
10.	Multiply Evens by Odds
        Create a program that reads an integer number and multiplies the sum of all its even digits
        by the sum of all its odd digits:
        Hints
        1.	Create a method with a name describing its purpose (like getMultipleOfEvensAndOdds).
        The method should have a single integer parameter and an integer
        return value. Also, the method will call two other methods:
        2.	Create two other methods, each of which will sum either even or odd digits.
        3.	Implement the logic for summing even digits:
        4.	Do the same for the method that will sum odd digits.
        5.	As you test your solution, you may notice that it doesn't work for negative numbers. Following the program execution line by line, find and fix the bug (hint: you can use Math.abs()).
*/



import java.util.Scanner;

import static java.lang.Math.abs;

public class MultiplyEvensbyOdds {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = Integer.parseInt(scanner.nextLine());
        //System.out.println(getSumOfEvenNummbers(a));  //Control Funktion Workt right
       // System.out.println(getSumOfOddNumbers(a));    //Control Funktion Workt right
        System.out.println(getMultipleOfEvensAndOdds(a));


    }

    public static int getMultipleOfEvensAndOdds(int n){
        int oddSum = getSumOfOddNumbers(n);
        int evenSum = getSumOfEvenNummbers(n);
  //      int povSum = (int)Math.pow(abs(oddSum),abs(evenSum)); // Check Other TASK
        //System.out.println(povSum)
        return abs(oddSum)*abs(evenSum);
    }

    public static int getSumOfEvenNummbers (int n){
        int sum=0;
        while (n!=0){
            if (n%2==0){
                sum=sum+n%10;
            }
            n/=10;
        }
        return sum;
    }

    public static int getSumOfOddNumbers(int b){

        int sum=0;
        while (b!=0){
            if (b%2!=0){
                sum=sum+b%10;
            }
            b/=10;
        }
        return sum;

    }
}
