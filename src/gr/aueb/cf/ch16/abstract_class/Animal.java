package gr.aueb.cf.ch16.abstract_class;

public abstract class Animal {
    private Long id;
    private String name;

    public Animal () {

    }

    public Animal(Long id, String name) {
        this.id = id;
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

//    Αν ειναι abstract υποχρεωνει τις derived classes να υλοποιησουν την toString
    public abstract String toString();

    public abstract void speak();

    public void eat() {
        System.out.println(name + " is eating" );
    }
}
