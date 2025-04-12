package gr.aueb.cf.ch20;

public class RegExMain {
    public static void main(String[] args) {

       String s = "red";
        System.out.println(isRed(s));
        System.out.println(isRedOrGreen(s));

    }

    /**
     * Ελέγχει (matches) αν το input string είναι το "red"
     * @param s
     * @return
     */
    public static boolean isRed(String s) {
        return s.matches("red");
    }

    /**
     * Ελέγχει (matches) αν το input string είναι "red" ή "green"
     * @param s
     * @return
     */
    public static boolean isRedOrGreen(String s){
        return s.matches("red|green");
    }

}
