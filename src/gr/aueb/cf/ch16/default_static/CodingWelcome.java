package gr.aueb.cf.ch16.default_static;

public class CodingWelcome implements IWelcome{

//    Hide : Αποκρύπτεται απο την coding welcome η staticWelcome. Δημιουργούμε τη δική μας.
    public static void staticMethod() {
        System.out.println("static method from CodingWelcome hides Welcome");
    }

    @Override
    public void defaultMethod() {
        System.out.println("Overridden default method in CodingWelcome");
        IWelcome.super.defaultMethod();
    }
}
