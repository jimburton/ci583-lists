package ci583.labs.lists;

public abstract class LinkedCollection {
    protected Node _head;

    public boolean isEmpty() {
        return _head == null;
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
