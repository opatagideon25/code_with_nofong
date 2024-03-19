import java.util.Scanner;

public class RealZodiac {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        boolean validInput = false;

        while (!validInput) {
            try {
                System.out.print("Enter your month of birth: ");
                String month = input.next().toUpperCase();
                System.out.print("Enter your year of birth: ");
                int year = input.nextInt();

                String zodiacSign = determineZodiacSign(month);
                String animalTrait = determineAnimalTrait(year % 12);

                System.out.println("Your Zodiac Sign: " + zodiacSign);
                System.out.println("Your Animal Trait: " + animalTrait);

                validInput = true; // If no exception occurred, input is valid
            } catch (Exception e) {
                System.out.println("Invalid input. Please enter valid month and year.");
                input.nextLine(); // Clear the input buffer
            }
        }

        input.close();
    }

    private static String determineZodiacSign(String month) {
        return switch (month) {
            case "JANUARY" -> "Aquarius - Ambitious, disciplined, responsible, practical, patient, and sometimes pessimistic.";
            case "FEBRUARY" -> "Pisces - Compassionate, intuitive, imaginative, gentle, selfless, and sometimes escapist.";
            case "MARCH" -> "ARIES - Ambitious, confident, energetic, passionate, courageous, and sometimes impulsive.";
            case "APRIL" -> "TAURUS - Reliable, patient, practical, determined, sensual, and sometimes stubborn.";
            case "MAY" -> "GEMINI - Adaptable, curious, sociable, witty, expressive, and sometimes indecisive.";
            case "JUNE" -> "CANCER - Nurturing, emotional, intuitive, protective, empathetic, and sometimes moody.";
            case "JULY" -> "LEO - Confident, generous, loyal, charismatic, passionate, and sometimes arrogant.";
            case "AUGUST" -> "VIRGO - Analytical, practical, detail-oriented, reliable, modest, and sometimes overly critical.";
            case "SEPTEMBER" -> "LIBRA - Diplomatic, charming, cooperative, fair-minded, sociable, and sometimes indecisive.";
            case "OCTOBER" -> "SCORPIO - Intense, determined, passionate, secretive, loyal, and sometimes possessive.";
            case "NOVEMBER" -> "SAGITTARIUS - Optimistic, adventurous, independent, philosophical, generous, and sometimes tactless.";
            case "DECEMBER" -> "CAPRICORN - Ambitious, disciplined, responsible, practical, patient, and sometimes pessimistic.";
            default -> "Invalid month";
        };
    }

    private static String determineAnimalTrait(int remainder) {
        return switch (remainder) {
            case 1 -> "Rooster - Flamboyant, confident, diligent, resourceful.";
            case 2 -> "Dog - Loyal, honest, kind, protective.";
            case 3 -> "Pig - Compassionate, gentle, sincere, artistic.";
            case 4 -> "Rat - Intelligent, adaptable, charming, sociable.";
            case 5 -> "Ox - Strong, reliable, patient, hardworking.";
            case 6 -> "Tiger - Brave, confident, ambitious, adventurous.";
            case 7 -> "Rabbit - Gentle, kind-hearted, diplomatic, artistic.";
            case 8 -> "Dragon - Charismatic, powerful, visionary, creative.";
            case 9 -> "Snake - Intuitive, wise, mysterious, determined.";
            case 10 -> "Horse - Independent, energetic, loyal, adventurous.";
            case 11 -> "Sheep - Gentle, compassionate, harmonious, artistic.";
            case 0 -> "Monkey - Clever, witty, playful, adaptable.";
            default -> "Invalid year of birth";
        };
    }
}
