package gr.aueb.cf.ch19.singly_linked_list;

public class Node <T> {
    private T item;

//    Το next είναι δείκτης σε node
    private Node<T> next;

//    Getters
    public T getItem() {
        return item;
    }

    public Node<T> getNext() {
        return next;
    }

//    Setters
    public void setItem(T item) {
        this.item = item;
    }

    public void setNext(Node<T> next) {
        this.next = next;
    }
}
