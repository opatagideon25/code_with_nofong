import java.util.Scanner;

public class UMaTGrades {
    public static void main(String[] args) {
        //CREATE SCANNER
        Scanner input = new Scanner(System.in);
        //ASK USER TO ENTER MARK
        System.out.print("Enter your mark: ");
        double mark = input.nextDouble();


        if (mark>100||mark<0) {
            System.out.println("Invalid input");
        } else {
            if (mark>=80.0) {
                System.out.println(mark+" is 1st Class");
            } else if ((mark>=70.0)&&(mark<80.0)) {
                System.out.println(mark+" is 2nd Upper");
            } else if ((mark>=60.0)&&(mark<70.0)) {
                System.out.println(mark+" is 2nd Lower");
            } else if ((mark>=50)&&(mark<60)) {
                System.out.println(mark+" is Pass");
            } else {
                System.out.println(mark+" is Fail");
            }
        }

        //CLOSE SCANNER
        input.close();
    }
}
