/*
3.	Printing Triangle
        Create a method for printing triangles as shown below:
*/



import java.util.Scanner;

public class PrintingTriangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = Integer.parseInt(scanner.nextLine());
    printColom(a);

    }
    public static void printColom(int num){
        for (int i = 1; i <= num; i++) {
            printLine(1,i);
        }
        for (int i = num-1; i >=1 ; i--) {
            printLine(1,i);

        }
    }
    public static void printLine(int start, int end){
        for (int i = start; i <= end; i++) {
            System.out.print(i + " ");

        }
        System.out.println();
    }

}
