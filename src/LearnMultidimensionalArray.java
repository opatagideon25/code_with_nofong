import java.util.Arrays;

public class LearnMultidimensionalArray {
    public static void main(String[] args) {
        double [][] rolex = new double[4][4];
        for (int i = 0;i< rolex.length;i++){
            for (int j = 0;j< rolex[i].length;j++){
                rolex[i][j] = Math.ceil(Math.random()*100);
            }
        }
        System.out.println(Arrays.deepToString(rolex));
        
    }
}
