package ci583.labs.lists;

/**
 * A set implemented as linked list.
 */

public class SortedList extends LinkedList {

    public void insert (int data) {
        throw new UnsupportedOperationException("Method not implemented");
    }

    public SortedList tail() {
        if(_head == null){
            throw new NullPointerException("Empty collection");
        } else if (_head.next == null) {
            return null;
        } else {
            SortedList l = new SortedList();
            l._head = _head.next;
            return l;
        }
    }
}
