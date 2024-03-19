import java.util.Scanner;

public class MultipleOfTwoIntegers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int f1 = input.nextInt();
        System.out.print("Enter a second integer: ");
        int f2 = input.nextInt();
        if (f2%f1==0){
            System.out.println(f1+" is a multiple of "+f2);
        } else {
            System.out.println(f1+" is not a multiple of "+f2);
        }

        input.close();
    }
}
