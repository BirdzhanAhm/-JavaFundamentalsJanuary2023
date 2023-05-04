import java.util.Scanner;

public class FactorialDivision_08 {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    //Inputdate:number 1 and nummber 1
    int number1 = Integer.parseInt(scanner.nextLine());
    int number2 = Integer.parseInt(scanner.nextLine());
    long fact1 = FactorialNumber(number1);
    long fact2= FactorialNumber(number2);
    double devisionsFaktoriel = fact1*1.0/fact2; //Fakt 1 change von Int to double whit *1.0
        System.out.printf("%.2f",devisionsFaktoriel); //print example 10.00 two digit after point
    }


    public static long FactorialNumber (int num){
        // example 5!
        // 5!=1*2*3*4*5=120
        long fact = 1; //contain factorial
        for (int i = 1; i <=num ; i++) {
            fact=fact*i;
        }
          return fact;

    }
}
