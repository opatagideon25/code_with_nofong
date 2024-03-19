import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class NewOutUpdatedFile {
    public static void main(String[] args) throws FileNotFoundException {
        File inputFile = new File("text.txt");
        File outputFile = new File("Opata.txt");

        try (PrintWriter output = new PrintWriter(outputFile); Scanner input = new Scanner(inputFile)) {
            while (input.hasNextLine()) {
                String line = input.nextLine();
                System.out.println(line.toUpperCase());
                String uppercaseLine = line.toUpperCase();
                output.println(uppercaseLine);
            }

        } catch (FileNotFoundException e) {
            System.out.println("File not found");
        }
    }
}
