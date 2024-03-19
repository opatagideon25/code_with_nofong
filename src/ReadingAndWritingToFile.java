import java.io.File;
import java.io.FileNotFoundException;
import java.lang.reflect.Array;
import java.util.Scanner;

public class ReadingAndWritingToFile {
    public static void main(String[] args) {
        File inputFile = new File("text.txt");
        Scanner input = null;

        try {
            input = new Scanner(inputFile);
        } catch (FileNotFoundException e) {
            System.out.println("File not found");
            Array words;
//            String[] words = new String[15];

            while (input.hasNext()) {
                if (input.hasNextInt()) {
                    int x = input.nextInt();
                    System.out.println(x + ": is an int");
                } else if (input.hasNextDouble()) {
                    double y = input.nextDouble();
                    System.out.println(y + ": is a dec");
                } else if (input.hasNextBoolean()) {
                    boolean k = input.nextBoolean();
                    System.out.println(k + ": is boolean");
                } else {
                    String str = input.next();
                    System.out.println(str + ": is a string");

                }
            }
        }

    }
}
