package gr.aueb.cf.ch14;

public class Person {

    private long id;
    private String firstname;
    private String lastname;

//    Constructors

    public Person() {

    }

    public Person(long id, String firstname, String lastname) {
        this.id = id;
        this.firstname = firstname;
        this.lastname = lastname;
    }

//    Getters
    public long getId() {
        return id;
    }

    public String getFirstname() {
        return firstname;
    }

    public String getLastname() {
        return lastname;
    }

//    Setters

    public void setId(long id) {
        this.id = id;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

//    Public API

    public void work() {
        System.out.println("Doing some work");
    }

    public void speak() {
        System.out.println("Says something");
    }


}
