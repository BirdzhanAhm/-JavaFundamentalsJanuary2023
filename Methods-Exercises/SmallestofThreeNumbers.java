/*
1 task Write a method to print the smallest of three integer numbers.
        Use an appropriate name for the method.

*/

import java.util.Scanner;

public class SmallestofThreeNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = Integer.parseInt(scanner.nextLine());
        int b = Integer.parseInt(scanner.nextLine());
        int c = Integer.parseInt(scanner.nextLine());
        printSmallNumber(a,b,c);
    }

    public static void  printSmallNumber(int n1, int n2, int n3){
        if(n1<n2 && n1<n3){
            System.out.println(n1);
        }else if(n2<n1 && n2<n3){
            System.out.println(n2);
        }else
            System.out.println(n3);
    }
}
