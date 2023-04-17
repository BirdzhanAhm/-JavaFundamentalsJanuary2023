/*
2.	Grades
        Write a method that receives a grade between 2.00 and 6.00 and prints the corresponding grade in words:
        •	2.00 – 2.99 - "Fail"
        •	3.00 – 3.49 - "Poor"
        •	3.50 – 4.49 - "Good"
        •	4.50 – 5.49 - "Very good"
        •	5.50 – 6.00 - "Excellent"
*/



import java.util.Scanner;

public class Grades {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double a = Double.parseDouble(scanner.nextLine());
        printGrade(a);
    }

    public static void printGrade(double gr) {
        if (gr >= 2.00 && gr <= 2.99) {
            System.out.println("Fail");
        } else if (gr <= 3.49) {
            System.out.println("Poor");
        } else if ( gr <= 4.49) {
            System.out.println("Good");
        } else if (gr <= 5.49) {
            System.out.println("Very good");
        } else if ( gr <= 6.00) {
            System.out.println("Excellent");
        }
    }
}
