import java.util.Scanner;

public class Zodiac {
    public static void main(String[] args) {
        //CREATE SCANNER
        Scanner input = new Scanner(System.in);
        //ASK USER TO ENTER YEAR
        System.out.print("Enter your year of birth: ");
        boolean validInput = false;
        while (!validInput){


            try {
                int year = input.nextInt();
                switch (year%12){
                    case 0:
                        System.out.println("Monkey");
                        validInput=true;
                        break;
                    case 1:
                        System.out.println("Rooster");
                        validInput=true;
                        break;
                    case 2:
                        System.out.println("Dog");
                        validInput=true;
                        break;
                    case 3:
                        System.out.println("Pig");
                        validInput=true;
                        break;
                    case 4:
                        System.out.println("Rat");
                        validInput=true;
                        break;
                    case 5:
                        System.out.println("Ox");
                        validInput=true;
                        break;
                    case 6:
                        System.out.println("Tiger");
                        validInput=true;
                        break;
                    case 7:
                        System.out.println("Rabbit");
                        validInput=true;
                        break;
                    case 8:
                        System.out.println("Dragon");
                        validInput=true;
                        break;
                    case 9:
                        System.out.println("Snake");
                        validInput=true;
                        break;
                    case 10:
                        System.out.println("Horse");
                        validInput=true;
                        break;
                    case 11:
                        System.out.println("Sheep");
                        validInput=true;
                        break;
                    default:
                        System.out.println("Invalid year of birth");
                }
            } catch (Exception f){
                System.out.print("Please enter a valid year: ");
                input.nextLine();
            }
        }


        //closing scanner
        input.close();
    }
}
