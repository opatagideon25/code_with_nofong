public class CharactersStrings {
    public static void main(String[] args) {
        //ESCAPE SEQUENCES IN JAVA \t \n \" \' \b
        System.out.println("test tab \tcheck");
        System.out.println("test newline \ncheck");
        System.out.println("test  \"check\"");
        System.out.println("test  \'check\'");
        //CASTING CHARACTERS AS NUMBERS AND VICE VERSA
        //WHAT CHARACTER NUMBERS REPRESENT
        System.out.println("5256 reps char: "+(char)5256);
        System.out.println("525 reps char: "+(char)525);
        System.out.println("2665 reps char: "+(char)2665);
        System.out.println("20002 reps char: "+(char)20002);
        //WHAT NUMBERS CHARACTERS ARE STORED
        System.out.println("' ' stored as num: "+(int)' ');
        System.out.println("'?' stored as num: "+(int)'?');
        System.out.println("'A' stored as num: "+(int)'A');
        System.out.println("'+' stored as num: "+(int)'+');
        //CHARACTER DECLARATION
        char letter = 'A';
        char num = '2';
        System.out.println("Is "+letter+" a number? " + Character.isDigit(letter));
        System.out.println("Is "+letter+" a letter? " + Character.isLetter(letter));
        System.out.println("Is "+num+" a number? " + Character.isDigit(num));
        System.out.println("Is "+num+" a letter? " + Character.isLetter(num));
        System.out.println("Is "+letter+" in lowercase? " + Character.isLowerCase(letter));
        System.out.println("Is "+letter+" in uppercase? " + Character.isUpperCase(letter));
        //STRING DATA TYPE
        String fname = "Nana Ebela";
        String sname = "nana";
        System.out.println(fname+" is "+fname.length()+" length");
        System.out.println(fname.concat(sname));
        System.out.println("aaa"+fname+"aaa");
        System.out.println("aaa"+fname.trim()+"aaa");
        System.out.println(fname.equals(sname));
        System.out.println(fname.equalsIgnoreCase(sname));
    }
}
