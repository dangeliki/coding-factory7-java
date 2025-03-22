package gr.aueb.cf.ch19.streams;

import java.util.List;
import java.util.Optional;

public class FindAndMatch {
    public static void main(String[] args) throws Exception {

        List<String> names = List.of("Alice","Bob","Charlie","David");

//        Optional is a class/container for wrapping null. Avoid NPE (NullPointerException)
        Optional<String> query = names.stream()
                .filter(name -> name.equals("Alice"))
                .findFirst();

        if(query.isPresent()) {
            System.out.println("Firstname: " +query.get());
        }

        query.ifPresent(first -> System.out.println("First name" + first));

//        Αν δεν βρει ονομα που να ειναι Bob,επιστρεφει Null
        String strFirst = names.stream()
                .filter(name -> name.equals("Bob"))
                .findFirst().orElse(null);

//        Αν δεν βρει ονομα που να ειναι Bob , κανει throw exception
        String strFirst2 = names.stream()
                .filter(name -> name.equals("Bob"))
                .findFirst().orElseThrow(() -> new Exception("Alice not Exists"));

    }
}
