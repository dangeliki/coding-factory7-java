package gr.aueb.cf.ch20.reflection;

public class Teacher {
    private Long id;
    private String firstname;
    private String lastname;

//    Constructors
    public Teacher() {

    }

    public Teacher(Long id) {
        this.id = id;
    }

    public Teacher(Long id, String firstname, String lastname) {
        this.id = id;
        this.firstname = firstname;
        this.lastname = lastname;
    }

//    Getters
    public Long getId() {
        return id;
    }

    public String getFirstname() {
        return firstname;
    }

    public String getLastname() {
        return lastname;
    }

//    Setters
    public void setId(Long id) {
        this.id = id;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

//    Public APIs
    public void sayHello() {
        System.out.println("Hello");
    }
    public void saySomething(String message) {
        System.out.println(message);
    }
}
