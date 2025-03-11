package gr.aueb.cf.ch19;

public class MainGen {
    public static void main(String[] args) {

        NodeGen<String> strNode = new NodeGen<>();
        NodeGen<Integer> intNode = new NodeGen<>();

//        Αριστερά το var ισούται με NodeGen<Double> (αντί να το γράφουμε όλο)
        var doubleNode = new NodeGen<Double>();

        intNode.setItem(1);
//        String s = (String) intNode.getItem();

    }
}
