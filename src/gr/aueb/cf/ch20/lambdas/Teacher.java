package gr.aueb.cf.ch20.lambdas;

public class Teacher {

    private int id;
    private String firstname;
    private String lastname;

//    Constructors
    public Teacher(){

    }

    public Teacher(int id, String firstname, String lastname) {
        this.id = id;
        this.firstname = firstname;
        this.lastname = lastname;
    }

//    Getters
    public int getId() {
        return id;
    }

    public String getFirstname() {
        return firstname;
    }

    public String getLastname() {
        return lastname;
    }

//    Setters
    public void setId(int id) {
        this.id = id;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

//    toString
    @Override
    public String toString() {
        return ("id: " +id+ "\nFirstname: " +firstname+ "\nLastname: " +lastname);
    }

    public void printInstanceTeacher() {
        System.out.println("id: " +id+ "\nFirstname: " +firstname+ "\nLastname: " +lastname);
    }

    public static void printStaticTeacher(Teacher teacher) {
        System.out.println("id: " +teacher.getId()+ "\nFirstname: " +teacher.getFirstname()+ "\nLastname: " +teacher.getLastname());
    }
}
