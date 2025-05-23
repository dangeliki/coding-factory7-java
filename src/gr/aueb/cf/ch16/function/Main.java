package gr.aueb.cf.ch16.function;

public class Main {
    public static void main(String[] args) {
//        αριστερά ο τυπος το interface και δεξια η υλοποιηση **ADDITION CALCULATOR IS A ICALCULATOR**
        ICalculator addition = new AdditionCalculator();
        int result = addition.operate(1,2);
        System.out.println(result);

//        Δημιουργειται μια ανωνυμη κλαση που υλοποιει τον iCalculator
//        To sub ειναι το instance απο την ανωνυμη κλαση
        ICalculator sub = new ICalculator() {
            @Override
            public int operate(int a, int b) {
                return 0;
            }
        };

        int result2 = sub.operate(10,6);
        System.out.println(result2);

//        Lamda Expression
//        Το mul ειναι instance μιας κλάσης που υλοποιει την ICalculator (functional interface)
//        Ειναι ιδιο με την ανωνυμη κλαση αλλα πολυ πιο συντομο
//        Το functional interface ειναι στην πραγματικοτητα ενα function
        ICalculator mul = (a,b) -> a * b ;
        int result3 = mul.operate(3,7);
        System.out.println(result3);

    }
}
