import java.util.Scanner;

public class TimeConversion {
    public static void main(String[] args) {
        System.out.print("Enter time in seconds: ");
        Scanner input = new Scanner(System.in);
        long timeEntered = input.nextLong();
        long timeInMinutes = timeEntered/60;
        long timeInSecs = timeEntered%60;
        long timeInHours = timeInMinutes/60;
        timeInMinutes = timeInMinutes%60;
        long timeInDays = timeInHours/24;
        timeInHours = timeInHours%24;
        long timeInYears = timeInDays/365;
        timeInDays = timeInDays%365;
        System.out.println("Time is being printed out in the form years:days:hours:minutes:secs");
        System.out.println(timeEntered+" is "+timeInYears+":"+timeInDays+":"+timeInHours+":"+timeInMinutes+":"+timeInSecs);

        input.close();
    }
}
