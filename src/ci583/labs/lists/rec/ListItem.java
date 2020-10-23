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
		throw new UnsupportedOperationException("Method not implemented");
	}

	@Override
	public LinkedList tail() {
		throw new UnsupportedOperationException("Method not implemented");
	}

	@Override
	public boolean isEmpty() {
		throw new UnsupportedOperationException("Method not implemented");
	}

	@Override
	public int length() {
		throw new UnsupportedOperationException("Method not implemented");
	}

	@Override
	public boolean member(int e) {
		throw new UnsupportedOperationException("Method not implemented");
	}

	@Override
	public int indexOf(int e) {
		throw new UnsupportedOperationException("Method not implemented");
	}

	@Override
	protected int indexOfInner(int e, int count) {
		throw new UnsupportedOperationException("Method not implemented");
	}

	@Override
	public LinkedList delete(int e) {
		throw new UnsupportedOperationException("Method not implemented");
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
}
