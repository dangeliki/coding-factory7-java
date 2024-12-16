package gr.aueb.cf.ch9;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintStream;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class FileInOutApp {

    public static void main(String[] args) {

        File inFd = new File("C:/tmp/file7.txt");
        File outFd = new File("C:/tmp/file7-out.txt");

        String line;
        String[] tokens;
//        Buffered reader : παίρνει ως παράμετρο ένα αρχείο και το διαβάζει
        try (Scanner in = new Scanner(inFd);
             PrintStream ps = new PrintStream(outFd, StandardCharsets.UTF_8)) {
//            Όσο δεν υπάρχει end of file - όσο υπάρχει κάτι να διαβάσω
            while (in.hasNextLine()){
                line = in.nextLine();
//               το \\s σημαίνει wide spaces και το + σημαινει ενα η περισσοτερα κενα
//                διαχωρζω τα tokens
                tokens = line.split("\\s+");
                for (String token : tokens) {
//                    Με το trim καλύπτεται η πιθανότητα να ξεκιάει να διαβάζει κενά
//                    Το trim κόβει τα κενά από αριστερά και δεξιά
//                    System.out.print(token.trim() + " ");
                    ps.printf("%s ",token);
//                Μπορουμε ακαριαια να γραψουμε δεδομενα (χωρις να κρατωνται σε καποιον buffer)
                    ps.flush();
                }
                System.out.println();
                ps.println();
            }
        } catch (IOException e){
            e.printStackTrace();
        }

    }
}
