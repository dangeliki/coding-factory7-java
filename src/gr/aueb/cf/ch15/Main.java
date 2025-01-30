package gr.aueb.cf.ch15;

public class Main {
    public static void main(String[] args) {
//        Τα interface δεν γίνονται instatiate, δεν μπορούμε να κάνουμε new interface
//        Αριστερά είναι ο τύπος και δεξιά η υλοποίηση. Cat is a ISpeakable
        ISpeakable cat = new Cat("Maui");
        ISpeakable dog = new Dog("Thor");

        cat.speak();
        dog.speak();

        doSpeak(cat);
        doSpeak(dog);

    }

    public static void doSpeak(ISpeakable iSpeakable) {
        iSpeakable.speak();
    }
}
