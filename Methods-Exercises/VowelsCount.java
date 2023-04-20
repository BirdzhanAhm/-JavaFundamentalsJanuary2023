/*
2.	Vowels Count
        Write a method that receives a single string and prints the count of the vowels.
        Use an appropriate name for the method.
*/



import java.util.Locale;
import java.util.Scanner;

public class VowelsCount {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();
        printvowels(text);

    }
    //glasni bukvi a e o u
    //text SchWanShteiger
    //.toLowerCase() ->schwanshteiger
    //"schwanshteiger".toUppercase()->SCHWANSHTEIGER
    public static void printvowels(String strinput){    // Printira glasnite bukvi v Teksta
        int count=0;  //broy glasni bukvi
        for(char a:strinput.toLowerCase().toCharArray()){ //Streing to array
            //Chek
            if(a=='a'||a=='e'||a=='i'||a=='o'||a=='u'){
                count++;
            }
        }
        System.out.println(count);
    }
}
