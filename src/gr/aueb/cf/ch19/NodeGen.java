package gr.aueb.cf.ch19;

//Εισάγω τον παραμετρικό τύπο
public class NodeGen<T> {
//    Στο σώμα της κλάσης ορίζουμε σε σχέση με αυτόν τον τύπο
    private T item;

//    Constructor
    public NodeGen(){

    }
//    Getter
    public T getItem() {
        return item;
    }

//    Setter
    public void setItem(T item) {
        this.item = item;
    }
}
