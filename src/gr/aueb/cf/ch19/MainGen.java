package gr.aueb.cf.ch19;

import java.util.List;

public class MainGen {
    public static void main(String[] args) {

        NodeGen<String> strNode = new NodeGen<>();
        NodeGen<Integer> intNode = new NodeGen<>();

//        Αριστερά το var ισούται με NodeGen<Double> (αντί να το γράφουμε όλο)
        var doubleNode = new NodeGen<Double>();

        Integer[] intArr = {1,2,3,4,5,6};
        String[] cities = {"Athens","Paris","London"};

        print(intArr);
        print(cities);

        intNode.setItem(1);
//        String s = (String) intNode.getItem();

    }

    public static <T> void print(T[] arr) {
        for (T item : arr) {
            System.out.println(item);
        }
    }

    public static <T> void printList(List<T> list) {
        for (T t : list) {
            System.out.println(t);
        }
    }

//    Το ? είναι μπαλαντέρ και χρησ/ται ώστε να δηλώσει ότι αυτός ο τύπος είναι άγνωστος at run time
//    Το χρησ/με όταν δεν υπάρχουν εξαρτήσεις στο σώμα της μεθόδου
    public static void printGenericList(List<?> list , Object element) {
//        list.add(element);
        for (Object obj : list) {
            System.out.println(obj);
        }
    }

//    Με αυτόν τον τρόπο περιορίζουμε το γενικό. Βάζουμε ένα άνω όριο.
    public static void printNode(NodeGen<? extends Number> nodeGen){
        System.out.println(nodeGen.getItem());
    }

    public static <T extends Number> void printBounded(List<T> list) {
        double sum = 0.0;

        for (T number:list) {
            sum += number.doubleValue();
        }
    }

//    Ο κανόνας του PECS
    public static <T> void consumerProducer (List<? super T> consumer, List<? extends T> producer) {
        for (T t : producer ) {
            consumer.add(t);
        }
    }

}
