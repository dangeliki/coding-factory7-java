package gr.aueb.cf.ch19.singly_linked_list;

public class SingleList <T> {
    private Node<T> head = null;

    public void insertFirst(T t) {
        Node<T> tmp = new Node<>();
        tmp.setItem(t);
        tmp.setNext(head);

        head = tmp;
    }

//    Constructor
    public SingleList() {

    }
}
