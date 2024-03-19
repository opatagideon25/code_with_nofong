import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class exam {
    public static void main(String[] args) throws FileNotFoundException {
        //Reading input from the txt file
        File inputFile = new File("exam.txt");
        Scanner input = new Scanner(inputFile);

        ArrayList<String> arr = new ArrayList<>();
        while(input.hasNextLine()){
            arr.add(input.nextLine());
        }
        System.out.println(arr.size());//a. Print out the size of the ArrayList
        System.out.println(arr);
        arr.remove("1957 12");//b. Remove 1957 12 and Kofi Kelvin
        arr.remove("Kofi Kelvin");
        arr.add("Esi 23");//c. Add Esi 23 into the ArrayList
        System.out.println(arr);
        arr.clear();
        System.out.println(arr);


        input.close();
    }
}
