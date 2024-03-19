import java.lang.reflect.Array;

public class practQuiz3 {
    public static void main(String[] args) {
        double [] arr = {672.3,256.3,35.4,782.5,203.4,23.4,23.34,23.5,13.5,23.5};
        double m = 0.0;
        for(int i = 0;i<arr.length;i++){
            m+=arr[i];
        }
        System.out.println(m/arr.length);
    }
}
