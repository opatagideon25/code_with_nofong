import java.util.InputMismatchException;
import java.util.Scanner;

public class HandlingExceptions {
    public static void main(String[] args) {
        //Scanner to read input
        Scanner input = new Scanner(System.in);
        //Floating point division by zero
//        System.out.println(2.1/0);
//        System.out.println(-2.1/0);
//        System.out.println(0.0/0);
        int x = 0;
        int y = 0;
        int z = 0;
        while (true) {
            System.out.print("Enter the value of x (int): ");
            x = input.nextInt();
            System.out.print("Enter the value of y (int): ");
            y = input.nextInt();

            try {
                z = x / y;
                System.out.println(x+"/"+y+" (int) is "+z);
                break;
            } catch (ArithmeticException e) {
                System.out.println("Div by zero not allowed");
            }
        }
    }
}
