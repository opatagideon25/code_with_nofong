import java.util.Scanner;

public class AreaOfTriangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter length of the triangle as an integer: ");
        int length = input.nextInt();
        System.out.print("Enter the height of the triangle: ");
        double height = input.nextDouble();
        double area = (0.5*length)*height;
        System.out.println("Area of triangle is: "+area);

        input.close();
    }
}
