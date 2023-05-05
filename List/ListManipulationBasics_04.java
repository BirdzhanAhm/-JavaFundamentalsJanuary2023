/*
4.	List Manipulation Basics
        Write a program that reads a list of integers. Then until you receive "end", you will be given different commands:
        Add {number}: add a number to the end of the list
        Remove {number}: remove a number from the list
        RemoveAt {index}: remove a number at a given index
        Insert {number} {index}: insert a number at a given index
        Note: All the indices will be valid!
        When you receive the "end" command, print the final state of the list (separated by spaces).

        Inpit LIne :
        4 19 2 53 6 43
        Add 3
        Remove 2
        RemoveAt 1
        Insert 8 3
        end
*/




        import java.io.InterruptedIOException;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ListManipulationBasics_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //read Intiger number from command Line
        List<Integer> number =
                Arrays.stream(scanner.nextLine()  //"2 45 34 87 66 31 1" Read for One line all date
                                .split(" "))        //["2" "45" "34" "87" "66" "31" "1"] Create Array  von String  for each ELement Split whon " "
                        .map(Integer::parseInt)    // 2, 45, 34, 87, 66, 31, 1 Convert all from String to Intiger
                        .collect(Collectors.toList()); // {2 45 34 87 66 31 1  } Convert array to List
        String command = scanner.nextLine(); //Read Command from console
        while (!command.equals("end")){
            //Valid commend
            if (command.contains("Add")){
                //command = "Add {number}->"Add 4" split (" ") ->["Add", "4"]
                //[1]->"4" parse it ->4
                int elementToAdd = Integer.parseInt(command.split(" ")[1]); //Koy e Elementa koyto shte dobavq
                number.add(elementToAdd);
            }else if (command.contains("RemoveAt")){
                //command = "RemoveAt {index}->"RemoveAt 1" split (" ") ->["RemoveAt", "1"]
                //[1]->"1" parse it ->1
                int indexToRemove = Integer.parseInt(command.split(" ")[1]);
                number.remove(indexToRemove); //Premahvam dadeniq element o dadeniq indeks
            }else if (command.contains("Remove")){
                //command = "Remove {number}->"Remove 19" split (" ") ->["Remove", "19"]
                //[1]->"19" parse it ->19
                int elementToRemove = Integer.parseInt(command.split(" ")[1]);
                number.remove(Integer.valueOf(elementToRemove));  //Pokazvam che iskam da premahvam elementa
            }else if(command.contains("Insert")){
                //command = "Insert {index} [element]->"Insert 8 3" split (" ") ->["Insert", "8", "3"]
                //[1]->"8" parse it ->8
                //[2]->"3" parse it ->3
                int elementIndexx = Integer.parseInt(command.split(" ")[1]);
                int elementToInsert = Integer.parseInt(command.split(" ")[2]);
                number.add(elementToInsert,elementIndexx);
            }

            command=scanner.nextLine();
        }

        for (int numbers:number) {
            System.out.print(numbers +" ");
        }   //ENd Foreach cycle
    }
}
