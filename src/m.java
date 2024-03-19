import java.util.Scanner;

public class m {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the side or the hexagon: ");
        int s = input.nextInt();
        double Area = (6*Math.pow(s,2))/(4*Math.tan(Math.PI/6));
        System.out.println("The area is "+Area);

        input.close();
    }
}
