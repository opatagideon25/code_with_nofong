import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Scanner;

public class ReadWriteFile {
    public static void main(String[] args) throws FileNotFoundException {
        File inputFile = new File("text.txt");
        String[] words = {"", "", "", "", "", "", "", "", "", "", "", "", "", "", ""};

        Scanner input = null;
        try {
            input = new Scanner(inputFile);
        } catch (FileNotFoundException e) {
            System.out.println("File not found");
        }
        int i = 0;

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

                if (i< words.length){
                    words[i] = str.toUpperCase();
                    i++;

                }
            }
        }
        System.out.println(Arrays.toString(words));

        input.close();

        PrintWriter outputFile = new PrintWriter("out.txt");

        for (String word:words){
            outputFile.println(word);
        }

        outputFile.close();
    }
}
