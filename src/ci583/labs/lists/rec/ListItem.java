package ci583.labs.lists.rec;

public class ListItem extends LinkedList {
	int head;
	LinkedList tail;
	
	public ListItem(int head, LinkedList tail) {
		this.head = head;
		this.tail = tail;
	}
	
	@Override
	public int head() {
		return head;
	}

	@Override
	public LinkedList tail() {
		return tail;
	}
	
	@Override
	public boolean equals(Object o) {
		if(!(o instanceof ListItem)) return false;
		ListItem that = (ListItem) o;
		return head == that.head && tail.equals(that.tail);
	}
	
	@Override
	public String toString() {
		return head + " :: " + tail.toString();
	}
	/*
	 * The methods you need to implement start here
	 */
	@Override
	public boolean isEmpty() {
		return false;
	}
	@Override
	public int length() {
		return 1 + tail.length();
	}
	@Override
	public boolean member(int e) {
		return (head == e || tail.member(e));
	}
	@Override
	public int indexOf(int e) {
		return indexOfInner(e, 0);
	}
	@Override
	protected int indexOfInner(int e, int count) {
		return (e==head) ? count : tail.indexOfInner(e, ++count);
	}
	@Override
	public LinkedList delete(int e) {
		return (e==head) ? tail : new ListItem(head, tail.delete(e));
	}
}
