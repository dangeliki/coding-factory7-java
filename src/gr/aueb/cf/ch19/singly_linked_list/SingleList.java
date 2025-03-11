package gr.aueb.cf.ch19.singly_linked_list;

public class SingleList <T> {
    private Node<T> head = null;

    public void insertFirst(T t) {
        Node<T> tmp = new Node<>();
        tmp.setItem(t);
        tmp.setNext(head);

        head = tmp;
    }

    /**
     * Time complexity O(n)
     * @param t
     *      the value to be inserted
     */
    public void insertLast(T t) {
        Node<T> tmp = new Node<>();
        tmp.setItem(t);
        tmp.setNext(null);

        if(head == null){
            insertFirst(t);
            return;
        }

        Node<T> n;

        for (n = head; n.getNext() != null; n = n.getNext()) {

        }

        n.setNext(tmp);


    }

}
