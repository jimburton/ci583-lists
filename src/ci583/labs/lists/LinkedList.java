package ci583.labs.lists;

/**
 * A linked list storing ints. The nodes of the list are instances of the Node class.
 */
public class LinkedList {

    protected Node _head;

    public boolean isEmpty() {
        throw new UnsupportedOperationException("Method not implemented");
    }

    public int head() {
        throw new UnsupportedOperationException("Method not implemented");
    }

    public LinkedList tail() {
        throw new UnsupportedOperationException("Method not implemented");
    }

    public int length() {
        throw new UnsupportedOperationException("Method not implemented");
    }

    public void cons (int data) {
        throw new UnsupportedOperationException("Method not implemented");
    }

    public boolean member(int data) {
        throw new UnsupportedOperationException("Method not implemented");
    }

    public int indexOf(int data) {
        throw new UnsupportedOperationException("Method not implemented");
    }

    public boolean delete (int index) {
        throw new UnsupportedOperationException("Method not implemented");
    }

    public void printList () {
        Node n = _head;
        System.out.println(n.data);
        while (n.next != null) {
            n = n.next;
            System.out.println(n.data);
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        Node n = _head;
        while (n != null) {
            sb.append(n.data+":");
            n = n.next;
        }
        return sb.toString();
    }
}
