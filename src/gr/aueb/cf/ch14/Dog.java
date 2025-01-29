package gr.aueb.cf.ch14;

public class Dog extends Animal{

    private String breed;

//    Constructors
    public Dog() {

    }

    public Dog(String name, int age, String breed) {
        super(name, age);
        this.breed = breed;
    }

//    Setters

    public void setBreed(String breed) {
        this.breed = breed;
    }

//    Getters


    public String getBreed() {
        return breed;
    }

//    Override methods

    @Override
    public void searchForFood() {
        super.searchForFood();
        System.out.println("Dog ate the food");
    }

    @Override
    public void makeSound() {
        System.out.println("Woof");
    }
}
