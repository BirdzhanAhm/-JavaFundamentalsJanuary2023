/*
7.	Repeat String
        Write a method that receives a string and a repeat count n (integer).
        The method should return a new string (the old one repeated n times).
        Hints
        Firstly read the string and the repeat count n. Then create the method and pass it the variables:
*/




import java.util.Scanner;

public class RepeatString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String inputString = scanner.nextLine();
        int inputCount = Integer.parseInt(scanner.nextLine());
        System.out.println(repeatString(inputString,inputCount));
    }
    public static String repeatString(String funStr, int funkCount){
        String result="";
        for (int i = 0; i < funkCount; i++) {
            result=result+funStr;

        }
        return result;
    }
}
