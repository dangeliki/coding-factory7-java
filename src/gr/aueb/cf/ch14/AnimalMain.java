package gr.aueb.cf.ch14;

public class AnimalMain {

    public static void main(String[] args) {

        Dog dog = new Dog("Thor",10,"Golden Retriever");
        dog.makeSound();
        dog.searchForFood();

        doMakeSound(dog);

    }

//    Πολυμορφικη μεθοδος : περιεχει πολυμορφικη παραμετρο (εχει τυπο υψιλοτερο απο ολα σε ιεραρχια)
    public static void doMakeSound(Animal animal){
        animal.makeSound();
    }

}
