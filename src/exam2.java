import java.util.HashSet;
import java.util.Set;

public class exam2 {
    public static void main(String[] args) {
        Set<String> A = new HashSet<>(){{//30, -20, 46, Joyce, 15, Abena, 35
            add("30");
            add("-20");
            add("46");
            add("Joyce");
            add("15");
            add("Abena");
            add("35");
        }};
        System.out.println("Set A: "+A);
        Set<String> B = new HashSet<>(){{//B = {25, 19, 46, 30, 35, -20
            add("25");
            add("19");
            add("46");
            add("30");
            add("35");
            add("-20");
        }};
        System.out.println("Set B: "+B);
        Set<String> C = new HashSet<>(){{//C = {30, 45, 35, -20, 10, 12, 15}
            add("30");
            add("45");
            add("35");
            add("-20");
            add("10");
            add("12");
            add("15");
        }};
        System.out.println("Set C: "+C);
        A.remove("Joyce");//a. Remove Joyce and Abena from set A
        A.remove("Abena");
        System.out.println("Set A without Joyce and Abena: "+A);
        Set<String> unionAB = new HashSet<>(A);//b. Find the union of A and B
        unionAB.addAll(B);
        System.out.println("UnionAB: "+unionAB);
        Set<String> intersectionBC = new HashSet<>(B);//c. Find the intersection of B and C
        intersectionBC.retainAll(C);
        System.out.println("IntersectionBC: "+intersectionBC);
    }
}
