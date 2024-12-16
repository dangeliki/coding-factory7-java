package gr.aueb.cf.ch8;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TryWithResourses {
    public static void main(String[] args) {

        int num = 0;

//        Ο μεταγλωττιστης αυτοματα κανει close τον scanner όπως κανει η finally
//        Θα πρεπει ο resource να ειναι autocloseable
        try (Scanner in = new Scanner(System.in)){
            num = in.nextInt();
            System.out.println(num);

        } catch (InputMismatchException e) {
            e.printStackTrace();
        }

    }
}
