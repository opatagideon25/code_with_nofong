import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadingFiles2 {
    public static void main(String[] args) {
        //POINT TO TEXT FILE TO READ
        File inputFile = new File("text.txt");
        Scanner input = null;

        try {
            input = new Scanner(inputFile);
        } catch (FileNotFoundException e) {
            System.out.println("File not found");
        }

        while (input.hasNext()){
            if(input.hasNextInt()){
                int x = input.nextInt();
                System.out.println(x+": is an int");
            } else if (input.hasNextDouble()) {
                double y = input.nextDouble();
                System.out.println(y+": is a dec");
            } else if (input.hasNextBoolean()) {
                boolean k = input.nextBoolean();
                System.out.println(k+": is boolean");
            } else {
                String str = input.next();
                System.out.println(str+": is a string");
            }
        }
    }
}
