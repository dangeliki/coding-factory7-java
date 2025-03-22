package gr.aueb.cf.ch19.streams;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class FilterMain {
    public static void main(String[] args) {

        List<String> cities = List.of("Athens","London","Toronto","Tunis","Athens");

        // οταν θελουμε να αποφυγουμε να γραφουμε το lists , βαζουμε το var και η java συμπεραινει απο το τι γραφουμε μετα οτι θα επιστρεψει λιστα
        var tCities = cities.stream()
                .filter(city -> city.startsWith("T"))     //υποννοειται μια for. Ονομαζεται predicate γιατι ειναι boolean
                .collect(Collectors.toList());                  //Java8+ ,επιστρέφει mutable list

        var tCities2 = cities.stream()
                .filter(city -> city.length() >= 6)
                .toList();                                      //Java16 ,επιστρέφει immutable list

        tCities.forEach(System.out::println);

        //Επιστρέφει τα unique names της λίστας που δώσαμε
        Set<String> uniqueCityNames = cities.stream().collect(Collectors.toSet());
//        Set<String> uniqueCityNames = new HashSet<>(cities);
        uniqueCityNames.forEach(System.out::println);

        //Επιστρέφει τη λίστα με delimiter υτό που ορίζω
        var strCities = cities.stream()
                .collect(Collectors.joining(", "));
//        String strCities = String.join(", ",cities);
        System.out.println(strCities);



    }
}
