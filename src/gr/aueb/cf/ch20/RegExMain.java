package gr.aueb.cf.ch20;

public class RegExMain {
    public static void main(String[] args) {

       String s = "red";
        System.out.println(isRed(s));

    }

    public static boolean isRed(String s) {
        return s.matches("red");
    }

}
