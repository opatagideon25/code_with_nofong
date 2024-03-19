import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class WritingToFiles {
    public static void main(String[] args) throws FileNotFoundException {
        PrintWriter outputFile = new PrintWriter("out.txt");

        outputFile.println("Nana is lonely");
        outputFile.println("Because Ebela is absent");

        outputFile.close();
    }
}
