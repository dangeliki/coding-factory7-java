package gr.aueb.cf.ch9;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintStream;
import java.nio.charset.StandardCharsets;

/**
 * Διαβαζει απο ενα αρχειο δεδομενα
 */
public class NamesScanning {
    public static void main(String[] args) {

        String inFilePath = "C:/tmp/names.txt";
        String outFilePath = "C:/tmp/named-formatted.txt";
        String line;
        String[] tokens;

        try(BufferedReader reader = new BufferedReader(new FileReader(inFilePath));
            PrintStream ps = new PrintStream(outFilePath, StandardCharsets.UTF_8)) {

            while ((line = reader.readLine()) != null){
//                1 η περισσοτερα , και 0 η περισσοτερα κενα
                tokens = line.split(",+\\s*");
//                ps.printf("{ \"Firstname\": \"%s\", \"Lastname\": \"%s\", \"City\": \"%s\" },\n", tokens[0],tokens[1],tokens[2]);

            printFormatted(ps,tokens);  //γράφει στο αρχείο
            printFormatted(System.out,tokens);  //γράφει στην κονσόλα
            }

        } catch (IOException e){
            System.err.println(e.getMessage());
        }


    }

    public static void printFormatted(PrintStream ps,String[] tokens){
        ps.printf("{ \"Firstname\": \"%s\", \"Lastname\": \"%s\", \"City\": \"%s\" },\n", tokens[0],tokens[1],tokens[2]);
    }
}
