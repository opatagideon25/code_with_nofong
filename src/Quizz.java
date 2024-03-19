import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Scanner;

public class Quizz {
    public static void main(String[] args) throws FileNotFoundException {
        File inputFile = new File("quiz1.txt");
        File outputFile = new File("quizoutt.txt");

        double[] arr = new double[8]; // Array to store numbers from input file
        int i = 0;

        try ( Scanner input = new Scanner(inputFile)) {
            while (input.hasNextLine()) {
                arr[i] = Double.parseDouble(input.nextLine());
                i++;
            }

        } catch (FileNotFoundException e) {
            System.out.println("File not found");
        }


        System.out.println("Original array: " + Arrays.toString(arr));

        // Sort the array in ascending order
        Arrays.sort(arr);

        System.out.println("Sorted array: " + Arrays.toString(arr));

        try (PrintWriter output = new PrintWriter(outputFile)) {
            for (double num : arr) {
                output.println(num);
            }
        } catch (FileNotFoundException e) {
            System.out.println("Output file not found");
        }
    }
}
