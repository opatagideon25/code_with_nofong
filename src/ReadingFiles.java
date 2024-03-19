import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadingFiles {
    public static void main(String[] args) throws FileNotFoundException {
        //Read a text file in project folder
        File inputFile = new File("text.txt");
        //File fileDelete = new File("textdelete.txt");
        //Read a text file outside project folder
        File desktopFile = new File("C:\\Users\\opt\\Desktop\\textdesktop.txt");
        //check methods available on file variable
        System.out.println(inputFile.exists());
        System.out.println(desktopFile.exists());
        System.out.println(inputFile.length());
        System.out.println(inputFile.getAbsolutePath());
        System.out.println(inputFile.getTotalSpace());
        //fileDelete.delete();

        //Read content in text file
        Scanner input = new Scanner(inputFile);
        //Open text file and read content
        //WHILE LOOP TO ITERATE THROUGH THE FILE
        while (input.hasNextLine()){
            System.out.println(input.nextLine());
        }
        input.close();
    }
}
