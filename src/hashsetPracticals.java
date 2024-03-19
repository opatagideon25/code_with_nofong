import java.util.HashSet;
import java.util.Set;

public class hashsetPracticals {
    public static void main(String[] args) {
        //CREATION OF HASHSETS
        Set<Integer> stdAges= new HashSet<>();
        HashSet<String> stdNames= new HashSet<>();
        HashSet<String> stdNames1= new HashSet<>();
        HashSet<String> stdNames2= new HashSet<>();
        HashSet<Double> stdMarks= new HashSet<>();

        //ADDING CONTENT TO HASHSET
        stdAges.add(26);
        stdAges.add(48);
        stdAges.add(55);

        stdMarks.add(55.89);
        stdMarks.add(43.67);
        stdMarks.add(89.9);

        stdNames.add("Esi");
        stdNames.add("Araba");
        stdNames.add("Andy");
        stdNames.add("Ebela");
        stdNames.add("Nana");
        stdNames.add("Araba");

        stdNames1.add("Esi");
        stdNames1.add("Araba");
        stdNames1.add("Andy");
        stdNames1.add("Ebela");
        stdNames1.add("Nana");
        stdNames1.add("Araba");

        stdNames2.add("Esi");
        stdNames2.add("Kofi");
        stdNames2.add("Andy");
        stdNames2.add("Nana");
        stdNames2.add("Ebela");
        stdNames2.add("Araba");
        stdNames2.add("Charles");


        System.out.println(stdAges);
        System.out.println(stdMarks);
        System.out.println(stdNames);
        System.out.println(stdNames1);
        System.out.println(stdNames2);
    }
}
