public class umatStudent implements Cloneable {
    private String name = "Giddey🤪";//DEFAULT NAME
    private int yearOfBirth = 2000;//DEFAULT YEAR OF BIRTH
    private String homeTown = "Berekum";//DEFAULT HOMETOWN
    private String department = "CE";//DEFAULT DEPARTMENT
    private String programme = "Bsc";//DEFAULT PROGRAMME
    private int yearOfStudy = 2;//DEFAULT YEAR OF STUDY
    private String hall = "KT";//DEFAULT HALL
    private double CWA;//DEFAULT CWA
    private String gender= "Trans";//DEFAULT GENDER
    private int indexNumber;//DEFAULT INDEX NUMBER
    private double loan=0.0;//DEFAULT LOAN STATUS
    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
    umatStudent(){}
    umatStudent(String name, int yearOfBirth, String homeTown, String department, String programme, int yearOfStudy, String hall, double CWA, String gender, int indexNumber, double loan){
        this.name = name;
        this.yearOfBirth = yearOfBirth;
        this.homeTown = homeTown;
        this.department = department;
        this.programme = programme;
        this.yearOfStudy = yearOfStudy;
        this.hall = hall;
        this.CWA = CWA;
        this.gender = gender;
        this.indexNumber = indexNumber;
        this.loan = loan;
    }
    public  String getName() {
        return name;
    }
    public int getYearOfBirth() {
        return yearOfBirth;
    }

    public String getHomeTown() {
        return homeTown;
    }

    public String getDepartment() {
        return department;
    }

    public String getProgramme() {
        return programme;
    }

    public int getYearOfStudy() {
        return yearOfStudy;
    }

    public String getHall() {
        return hall;
    }

    public double getCWA() {
        return CWA;
    }

    public String getGender() {
        return gender;
    }

    public int getIndexNumber() {
        return indexNumber;
    }

    public double getLoan() {
        return loan;
    }



    public void setDepartment(String department) {
        this.department = department;
    }
    public void setProgramme(String programme) {
        this.programme = programme;
    }
    public void setCWA(double CWA) {
        this.CWA = CWA;
    }

    public void describe(){
        System.out.println("Hello"+this.name);

    }
}
