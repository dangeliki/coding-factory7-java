package gr.aueb.cf.ch19.sorting;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Product> products1 = List.of(new Product("",12.5,10),new Product("",12.5,10));  //επιστρέφει immutable list

        List<Product> products2 = Arrays.asList(new Product("", 12.5, 10), new Product("", 12.5, 10));   //επιστρέφει partially immutable list (επιτρέπει update)

        List<Product> products = new ArrayList<>(List.of(new Product("apples",12.5,17), new Product("oranges",12.5,2),new Product("berries",12.5,10),new Product("apples",32.5,20)));    //επιστρέφει mutable list

        products.sort(Comparator.naturalOrder());   //sort based on comparable
        products.sort(Comparator.reverseOrder());   //based on comparable

        //εφοσον ως παραμετρος υπαρχει interface, μπορω να υλοποιησω με lamda
        //και οταν υπαρχουν τα ιδια πραγματα δεξια και αριστερα μπορουμε να παρουμε method reference
        products.sort(Comparator.comparing(Product::getName));
        products.sort(Comparator.comparing(Product::getName).thenComparing(Product::getQuantity));
        products.sort(Comparator.comparing(Product::getName).thenComparing(Product::getQuantity).thenComparing(Product::getPrice).reversed());
        products.sort(Comparator.comparing(Product::getName).thenComparing(Product::getQuantity,Comparator.reverseOrder()));

        products.forEach(System.out::println);
    }
}
