import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class PractArrayList {
    public static void main(String[] args) {
        //CREATE AN ARRAYLIST
        ArrayList<String>stdNames= new ArrayList<String>();
        ArrayList<String> homeTown = new ArrayList<>();
        ArrayList<Double>stdMarks= new ArrayList<>();
        ArrayList<String> newNames = new ArrayList<>();
        System.out.println(stdNames.size());
        //ADDING CONTENT TO ARRAYLIST
        stdNames.add("Ama");
        stdNames.add("20.34");
        stdNames.add("Nana");
        stdNames.add("E");
        homeTown.add("Tarkwa");
        homeTown.add("Nzema");
        homeTown.add("Obuasi");


        System.out.println(stdNames.size());
        //LOOP TO ADD
        for (int i = 1; i<100;i++){
            //MMultiple of both 3 and 4
            if((i%3==0) && (i%4==0)){
                stdMarks.add((double)i);
            }
        }
        //PRINT CONTENT OF ARRAYLIST
        System.out.println(stdNames);
        System.out.println(stdMarks);
        System.out.println(homeTown);
        //REMOVE ITEM FROM ARRAYLIST
//        stdNames.remove("20.34");
        System.out.println(stdNames);
        stdNames.add(1,"Kofi");
        stdNames.add(1,"Kofi a");
        System.out.println(stdNames);
        System.out.println(stdNames.contains("Nana"));
        //GET ELEMENT AT AN INDEX
        System.out.println(stdNames.get(3));
        //SORT ARRAYLIST
        System.out.println("Before sorting");
        System.out.println(stdNames);
        Collections.sort(stdNames);
        System.out.println("After sorting");
        System.out.println(stdNames);
        Collections.reverse(stdNames);
        System.out.println("After reverse");
        System.out.println(stdNames);
        //ADD ALL CONTENT FROM ONE ARRAYLIST TO ANOTHER
        newNames.add("Araba");
        newNames.add("Selasi");
        System.out.println("Before addAll");
        System.out.println(newNames);
        newNames.addAll(stdNames);
        System.out.println("After addAll");
        System.out.println(newNames);



    }
}
