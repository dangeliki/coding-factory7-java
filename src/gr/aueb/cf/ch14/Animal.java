package gr.aueb.cf.ch14;

public class Animal {

    private String name;
    private int age;

//    Constructors
    public Animal() {

    }

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

//    Getters

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
//    Setters

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

//    Public APIs

    public void makeSound(){
        System.out.println("Some generic sound");
    }

    public void searchForFood(){
        System.out.println("Searches for food");
    }

}
