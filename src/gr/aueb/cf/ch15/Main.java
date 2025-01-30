package gr.aueb.cf.ch15;

public class Main {
    public static void main(String[] args) {
//        Τα interface δεν γίνονται instatiate, δεν μπορούμε να κάνουμε new interface
//        Αριστερά είναι ο τύπος και δεξιά η υλοποίηση. Cat is a ISpeakable
        ISpeakable cat = new Cat("Maui");
        ISpeakable dog = new Dog("Thor");
        GenericSpeakingSchool genericSpeakingSchool = new GenericSpeakingSchool(cat);
        GenericSpeakingSchool genericSpeakingSchool1 = new GenericSpeakingSchool(dog);

//        cat.speak();
//        dog.speak();
//
//        doSpeak(cat);
//        doSpeak(dog);
//
        genericSpeakingSchool.learnToSpeak();
        genericSpeakingSchool1.learnToSpeak();


    }

    public static void doSpeak(ISpeakable iSpeakable) {
        iSpeakable.speak();
    }
}
