package gr.aueb.cf.ch9;

import java.io.FileNotFoundException;
import java.io.PrintStream;

public class PrintStreamWithMethod {
    public static void main(String[] args) {
        try(PrintStream ps = new PrintStream("C:/tmp/file7-ps.txt")) {
//            Για να κάνει append τα αποτελέσματα στο ίδιο αρχείο
//      try(PrintStream ps = new PrintStream(new FileOutputStream("C:/tmp/file7-ps.txt",true))) {
                printMessage(ps,"Hello Coding Factory");
                printMessage(System.out,"Hello CF");

            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }
        }

    /**
     * Generic PrintStream method
     *
     * @param ps        the input PrintStream
     * @param message   the input message
     */
    public static void printMessage(PrintStream ps,String message) {
        ps.println(message);
    }
}
