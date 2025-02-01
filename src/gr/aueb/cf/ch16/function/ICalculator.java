package gr.aueb.cf.ch16.function;

//Δινω annotation ετσι ωστε να χτυπαει αν προσθεσω η αφαιρεσω μεθοδο. πρεπει να εχει ακριβως 1 μεθοδο

@FunctionalInterface
public interface ICalculator {
    int operate(int a , int b);
}
