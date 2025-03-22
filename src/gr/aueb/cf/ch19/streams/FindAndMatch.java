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
//        Οταν το lambda δεν παιρνει παραμετρο, βαζω παρενθεσεις ()
        String strFirst2 = names.stream()
                .filter(name -> name.equals("Bob"))
                .findFirst().orElseThrow(() -> new Exception("Alice not Exists"));

//        Match
        boolean isBobExists = names.stream().anyMatch(name -> name.equals("Bob"));
        boolean allAreBob = names.stream().allMatch(name -> name.equals("Bob"));
        boolean noneIsBob = names.stream().noneMatch(name -> name.equals("Bob"));

    }
}
