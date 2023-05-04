import java.util.Scanner;

public class TopNumber_10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = Integer.parseInt(scanner.nextLine());
        for (int i = 1; i <=a ; i++) {
            //da li e Top Chislo
            //1.proverka na top chislo
            //2. da sadarja pone edna nechetna cifra
        if(isContainOddNummber(i)&& IsSumDigitIsDiviaiblyTo8(i)){
            //otpechatva chsiloto
            System.out.println(i);

        } //if cloce

        }//For close

    } //Main Close

    public static boolean IsSumDigitIsDiviaiblyTo8(int num){  //Ex: num is 564
        int sum =0;
        while (num>0){
            int lastDigit=num%10; //Last Digit of number  Ex:lastDigit=4
            sum+=lastDigit; //Sum last digit of number  Ex:sum=0+4
            num=num/10; //change Number  Ex: num=56

        }
        //Check sum devision 8 is 0;
        if(sum%8==0){   //Optimisation (return sum%10==8;)
            return true;
        }else{
            return false;
        }
    } //END function IsSumDigitIsDiviaiblyTo8

    public static boolean isContainOddNummber(int number){
        while (number>0){
            int lastDigit=number%10;
            if (lastDigit%2!=0){
                return true;
                }else
                {
                number/=10;
                            }
         } //END while cycle
        return false;
        }//END function isContainOddNummber

    }//END MaIN CLASS


