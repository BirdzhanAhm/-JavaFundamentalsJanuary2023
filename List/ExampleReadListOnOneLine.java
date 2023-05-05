/*
All Methods to read List on Comand Line Examples
*/

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ExampleReadListOnOneLine {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> list1 = new ArrayList<>();
        List<Integer> number =
                Arrays.stream(scanner.nextLine()  //"2 45 34 87 66 31 1" Read for One line all date
                        .split(" "))        //["2" "45" "34" "87" "66" "31" "1"] Create Array  von String  for each ELement Split whon " "
                        .map(Integer::parseInt)    // 2, 45, 34, 87, 66, 31, 1 Convert all from String to Intiger
                        .collect(Collectors.toList()); // {2 45 34 87 66 31 1  } Convert array to List


        List<Double> decimalNumber=
        Arrays.stream(scanner.nextLine()  //"2.4 45.6 34.3 87.23 66.44 3.72 1.4" Read for One line all date
                        .split(" "))        //["2" "45" "34" "87" "66" "31" "1"] Create Array  von String  for each ELement Split whon " "
                .map(Double::parseDouble)    // 2, 45, 34, 87, 66, 31, 1 Convert all from String to Intiger
                .collect(Collectors.toList()); // {2 45 34 87 66 31 1  } Convert array to List

        //"Birdzhan SoftuNI Varna OTHRegensburg Java"
        List<String> text=
                Arrays.stream(scanner.nextLine() //"Birdzhan SoftuNI Varna OTHRegensburg Java"
                        .split(" "))       //"Birdzhan", "SoftUNI", "Varna", "OTHRegensburg", "Java"
                        .collect(Collectors.toList()); //{"Birdzhan" "SoftuNI" "Varna" "OTHRegensburg" "Java"}


     //   number.remove(9)    //Remove from list the first item encountered
     //   number.removeAll(9) //Remove from List all item encountered

        List<Double> dicimalStatik = new ArrayList<>(Arrays.asList(5.6, 5.5,88.4));

    }
}
