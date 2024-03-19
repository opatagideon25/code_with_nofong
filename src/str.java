import java.util.*;

public class str {
    public static void main(String[] args) {
        //TAKING INPUT FROM THE USER
        System.out.print("Enter a word: ");
        Scanner input = new Scanner(System.in);

        String f = input.next();
        System.out.println(f);
        ArrayList<Character>arr = new ArrayList<>();
        for (int i = 0;i<f.length();i++){
            arr.add(f.toCharArray()[i]);
        }
        Collections.reverse(arr);

        for (char v :arr){
            System.out.print(v);
        }


        input.close();

    }
}
