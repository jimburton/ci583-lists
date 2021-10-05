package ci583.labs.lists;

/**
 * A linked list storing ints. The nodes of the list are instances of the Node class.
 */
public class LinkedList {

    protected Node _head;

    public boolean isEmpty() {
        return _head == null;
    }

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

    public int length() {
        Node n = _head;
        int c = 0;
        while (n != null) {
            n = n.next;
            c++;
        }
        return c;
    }

    public void cons (int data) {
        Node n = new Node(data);
        Node oldHead = _head;
        _head = n;
        _head.next = oldHead;
    }

    public boolean member(int data) {
        Node n = _head;
        while (n != null) {
            if (n.data == data) {
                return true;
            }
            n = n.next;
        }
        return false;
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
