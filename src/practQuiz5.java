import java.util.Arrays;

public class practQuiz5 {
    public static void main(String[] args) {
        int [][] creditMarks = {{3,80},{2,93},{1,75},{3,82}};
        int credit = 0;
        double totalMarks = 0;
        for (int[] mark : creditMarks) {
            credit += mark[0];
        }
        for (int[] creditMark : creditMarks) {
            totalMarks += (creditMark[0] * creditMark[1]);
        }
        double average = totalMarks/credit;
        System.out.println(credit);
        System.out.println(average);
    }
}
