package gr.aueb.cf.ch13.exceptions;

public class NegativeAmountException extends Exception {

//    Default Constructor (δίνω και κάποια πληροφορία)
    public NegativeAmountException(double amount) {
        super("Amount" + amount + "is insufficient.");
    }

}
