public class tryUmat {
    public static void main(String[] args) throws CloneNotSupportedException {
        umatStudent gideon = new umatStudent();
        umatStudent kweku = new umatStudent("Kweku Frempong", 2004, "Takoradi", "CE", "CE", 2, "Figenco", 82.34, "Male", 32, 0);
        System.out.println(gideon.getName());
        System.out.println(kweku.getName());
        umatStudent opata = (umatStudent) kweku.clone();
        System.out.println(opata.getName());
    }
}
