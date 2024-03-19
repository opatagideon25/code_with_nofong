import java.lang.reflect.Array;
import java.util.Arrays;

public class PractArrays {
    public static void main(String[] args) {
        //CREATE A SD ARRAY OF DOUBLES
        double [] marks = new double[5];
        //CREATE A SD ARRAY OF INTEGERS
        int [] ages = new int[6];
        //CREATE A SD ARRAY FOR STRINGS
        String [] stdNames = new String[7];
        //CREATE A SD AND ADD CONTENT DURING CREATION
        double [] dist = {0.9, 65, 643, 9};
        //DISPLAY A SD ARRAY
        System.out.println("Before content addition");
        System.out.println(Arrays.toString(marks));
        System.out.println(Arrays.toString(ages));
        System.out.println(Arrays.toString(stdNames));
        System.out.println(Arrays.toString(dist));

        marks[3] = 43.6;

        for (int i=0; i<marks.length;i++){
            marks[i] = 34*i* Math.random();
        }

        for (int j=0; j< stdNames.length;j++){
            stdNames[j] = "Student"+j;
        }

        System.out.println();
    }
}
