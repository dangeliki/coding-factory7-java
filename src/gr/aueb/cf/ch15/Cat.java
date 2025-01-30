package gr.aueb.cf.ch15;

//Όταν κάνει implement, πρέπει να υλοποιήσει την μέθοδο του interface
public class Cat implements ISpeakable {

    private String name;

//    Constructors
    public Cat(){

    }

    public Cat(String name) {
        this.name = name;
    }
//    Getter
    public String getName() {
        return name;
    }
//    Setter
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void speak() {
        System.out.println(name + "says hello.");
    }


}
