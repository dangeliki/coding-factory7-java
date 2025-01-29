package gr.aueb.cf.ch14;

//Κληρονομεί τα πάντα εκτός από constructors και private πεδία
public class Circle extends Shape {
    
    //Το override μας προφυλασσει απο compile time errors
    @Override
    public void draw() {
        System.out.println("Drawing a circle.");
    }
}
