import java.util.Scanner;

public class Selections {
    public static void main(String[] args) {
        //CREATE SCANNER VARIABLE TO READ INPUT
        // % DIV TO CHECK IF ODD
        Scanner input = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int number = input.nextInt();
        //if % of number by 2 is not zero
        // number is odd
        if (number%2!=0){
            System.out.println(number+" is ODD");
        }

        // close scanner
        input.close();
    }
}
