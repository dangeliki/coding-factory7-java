package gr.aueb.cf.ch19.doubly_linked_list;

public class Node <T>{

    private T item;
    private Node<T> next;
    private Node<T> prev;

//    Getters
    public T getItem() {
        return item;
    }

    public Node<T> getNext() {
        return next;
    }

    public Node<T> getPrev() {
        return prev;
    }

//    Setters
    public void setItem(T item) {
        this.item = item;
    }

    public void setNext(Node<T> next) {
        this.next = next;
    }

    public void setPrev(Node<T> prev) {
        this.prev = prev;
    }
}
