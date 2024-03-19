import java.util.InputMismatchException;
import java.util.Scanner;

public class ZodiacMonths {
    public static void main(String[] args) {
        //creating scanner
        Scanner input = new Scanner(System.in);
        //Taking input from the user
        System.out.print("Enter your month of birth: ");
        String month = input.next();
        month = month.toUpperCase();
        boolean validity = false;
        while (!validity){
            try {
                switch (month){
                    case "JANUARY":
                        System.out.println("AQUARIUS");
                        validity = true;
                        break;
                    case "FEBRUARY":
                        System.out.println("PISCES");
                        validity = true;
                        break;
                    case "MARCH":
                        System.out.println("ARIES");
                        validity = true;
                        break;
                    case "APRIL":
                        System.out.println("TAURUS");
                        validity = true;
                        break;
                    case "MAY":
                        System.out.println("GEMINI");
                        validity = true;
                        break;
                    case "JUNE":
                        System.out.println("CANCER");
                        validity = true;
                        break;
                    case "JULY":
                        System.out.println("LEO");
                        validity = true;
                        break;
                    case "AUGUST":
                        System.out.println("VIRGO");
                        validity = true;
                        break;
                    case "SEPTEMBER":
                        System.out.println("LIBRA");
                        validity = true;
                        break;

                    case "OCTOBER":
                        System.out.println("SCORPIO");
                        validity = true;
                        break;
                    case "NOVEMBER":
                        System.out.println("SAGITTARIUS");
                        validity = true;
                        break;
                    case "DECEMBER":
                        System.out.println("CAPRICORN");
                        validity = true;
                        break;
                    default:
                        System.out.println("Invalid month");
                        throw new InputMismatchException();
                }
            } catch (InputMismatchException e){
                System.out.print("Please enter a valid month: ");
                input.nextLine();
                month   = input.next().toUpperCase();
            }
        }

        //closing Scanner
        input.close();
    }
}
