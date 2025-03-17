package gr.aueb.cf.ch19.lists;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class MainList {
    public static void main(String[] args) {

        List<String> cities = new ArrayList<>();

        cities.add("Athens");
        cities.add("London");
        cities.add("New York");

        String c = cities.get(0);

        int nyPosition = cities.indexOf("New York");
        if (nyPosition != -1) {
            cities.set(nyPosition,"NY");
        }
        else {
            System.out.println("NY not exists");
        }

        if (cities.contains("Athens")) {
            cities.remove("Athens");
        }
        else {
            System.out.println("Athens not exists");
        }

        cities.removeIf(city -> city.startsWith("A"));

//        Iterate (ο iterator πάντα δίνει το 1ο στοιχείο της λίστας)

//        #1
        for(int i = 0 ; i < cities.size() ; i ++) {
            System.out.println(cities.get(i));
        }

//        #2
        for(String city : cities) {
            System.out.println(city);
        }

//        #3
        Iterator<String> it = cities.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }

//        #4
        cities.forEach(System.out::println);
    }
}
