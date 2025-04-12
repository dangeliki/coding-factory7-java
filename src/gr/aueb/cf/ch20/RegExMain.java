package gr.aueb.cf.ch20;

import org.w3c.dom.ls.LSOutput;

public class RegExMain {
    public static void main(String[] args) {

       String s = "!6";
        System.out.println(isRed(s));
        System.out.println(isRedOrGreen(s));
        System.out.println(isrRedOrgGreen(s));
        System.out.println(beginsWithOneUpperCaseAndEndsInIng(s));
        System.out.println(isOneLetterAndEndsInIng(s));
        System.out.println(whitespaceDigit(s));
        System.out.println(anySymbolDigit(s));

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

    /**
     * Ελέγχει (matches) αν το input string είναι "red" ή "green" που ξεκινούν με πεζά ή κεφαλαία
     * @param s
     * @return
     */
    public static boolean isrRedOrgGreen(String s) {
        return s.matches("[rR]ed|[gG]reen");
    }

    /**
     * Ελέγχει (matches) αν το input string ξεκινάει με upper case και ακολουθεί -ing
     * @param s
     * @return
     */
    public static boolean beginsWithOneUpperCaseAndEndsInIng(String s){
        return s.matches("[A-Z]ing");
    }

    /**
     * Ελέγχει (matches) αν το input string έχει ένα γράμμα και τελειώνει σε -ing
     * @param s
     * @return
     */
    public static boolean isOneLetterAndEndsInIng(String s){
        return s.matches("[A-Za-z]ing");
    }

    public static boolean whitespaceDigit(String s){
        return s.matches("\\s\\d");
    }

    public static boolean anySymbolDigit(String s){
//        return s.matches(".\\d");
        return s.matches(".[0-9]");
    }

}
