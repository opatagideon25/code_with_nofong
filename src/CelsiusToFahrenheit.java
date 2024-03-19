import java.util.Scanner;

public class CelsiusToFahrenheit {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter temperature in celsius: ");
        double celsius = input.nextDouble();
        double fahrenheit = (double) 9 /5*celsius+32;
        System.out.println(celsius+" celsius is "+fahrenheit+" fahrenheit");

        input.close();
    }
}
