package ci583.labs.lists;

/**
 * A linked list storing ints. The nodes of the list are instances of the Node class.
 */
public class LinkedList extends LinkedCollection {

    public int head() {
        if(_head == null){
            throw new NullPointerException("Empty collection");
        } else {
            return _head.data;
        }
    }

    public LinkedList tail() {
        if(_head == null){
            throw new NullPointerException("Empty collection");
        } else if (_head.next == null) {
            return null;
        } else {
            LinkedList l = new LinkedList();
            l._head = _head.next;
            return l;
        }
    }

    public void cons (int data) {
        Node n = new Node(data);
        if (_head == null) {
            _head = new Node(data);
        } else {
            Node last = _head;
            while (last.next != null) last = last.next;
            last.next = n;
        }
    }

    public int indexOf(int data) {
        Node n = _head;
        int c = 0;
        while (n != null) {
            if (n.data == data) {
                return c;
            }
            n = n.next;
            c++;
        }
        return -1;
    }

    public boolean delete (int index) {
        Node n = _head;
        Node prev = null;
        int c = 0;
        while (n != null) {
            if (c == index) {
                if(c==0) {
                    _head = _head.next;
                } else {
                    prev.next = n.next;
                }
                return true;
            }
            prev = n;
            n = n.next;
            c++;
        }
        return false;
    }
}
