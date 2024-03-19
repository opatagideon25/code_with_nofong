import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class HashmapPracticals {
    public static void main(String[] args) {

        String message = "This is a boy";
        System.out.println(Arrays.toString(message.split("")));

        //CREATE A HASHMAP
        Map<String, Integer> stdAges = new HashMap<>();
        HashMap<Integer, Integer> stdDetails = new HashMap<>();
        //METHODS
        stdAges.put("Nana", 23);
        stdAges.put("Ebela", 20);
        stdAges.put("Araba", 35);
        stdAges.put("Roy", 45);
        stdAges.put("Nana", 30);

        System.out.println(stdAges);
        System.out.println(stdAges.containsKey("Roy"));
    }
}
