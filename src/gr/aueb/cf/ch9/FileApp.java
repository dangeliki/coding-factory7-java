package gr.aueb.cf.ch9;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileApp {
    public static void main(String[] args) {

        File fd = new File("C:/tmp/file7.txt");

        String line;
        String[] tokens;
//        Buffered reader : παίρνει ως παράμετρο ένα αρχείο και το διαβάζει
        try (Scanner in = new Scanner(fd)) {
//            Όσο δεν υπάρχει end of file - όσο υπάρχει κάτι να διαβάσω
            while (in.hasNextLine()){
                line = in.nextLine();
//               το \\s σημαίνει wide spaces και το + σημαινει ενα η περισσοτερα κενα
//                διαχωρζω τα tokens
                tokens = line.split("\\s+");
                for (String token : tokens) {
//                    Με το trim καλύπτεται η πιθανότητα να ξεκιάει να διαβάζει κενά
//                    Το trim κόβει τα κενά από αριστερά και δεξιά
                    System.out.print(token.trim() + " ");
                }
                System.out.println();
                }
            } catch (FileNotFoundException e){
            e.printStackTrace();
        }

    }
}
