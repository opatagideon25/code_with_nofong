import java.util.Arrays;

public class multiDimArrays {
    public static void main(String[] args) {
        //CREATE 2D ARRAY
        double [][] marks = new double[5][2];
        int [][] ages= {{23, 56, 23}, {74, 92, 3}, {44, 66, 2}};
        ages[0][1] = 0;//CHECKING IF EACH ARRAY REPRESENTS A ROW OR A COLUMN
        //FINALLY EACH ARRAY REPRESENTS A ROW NOT A COLUMN
        //A JAGGED ARRAY IS A MULTIDIMENSIONAL ARRAY THAT MAY HAVE DIFFERENT NUMBER OF COLUMNS FOR EACH ROW
        System.out.println(Arrays.deepToString(ages));

        //ADD CONTENT WITHOUT LOOPING
        marks[0][0] = 2.9;
        marks[0][1]=3.5;
        System.out.println(Arrays.deepToString(marks));

        //ADDING CONTENT WITH LOOP
        for (int i = 1;i< marks.length;i++){
            for (int g = 0;g<marks[i].length;g++){
                marks[i][g] = Math.ceil(Math.random()*100);
            }
        }
        System.out.println(Arrays.deepToString(marks));

        //GET CONTENT FROM A 2D ARRAY
        double x = marks[0][1];
        System.out.println(x);

        //PRINTING CONTENT OF 2D ARRAY
        System.out.println(Arrays.deepToString(marks));
        System.out.println(Arrays.deepToString(ages));
        for (double[] mark : marks) {
            System.out.println(Arrays.toString(mark));
        }
        //printing item by item
        for (double[] mark : marks) {
            for (double v : mark) {
                System.out.print(v + " ");
            }
            System.out.println();
        }

        //JAVA JAGGED MULTIDIMENSIONAL ARRAY
        int [][] stdMarks = {{2, 34, 34, 45}, {23, 64, 21, 35, 42, 33}, {3}, {2, 4, 35}};
        System.out.println(Arrays.deepToString(stdMarks));
    }
}
