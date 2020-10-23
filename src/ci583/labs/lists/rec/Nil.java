package ci583.labs.lists.rec;

public class Nil extends LinkedList {

	@Override
	public int head() {
		throw new RuntimeException("Called head on an empty list.");
	}

	@Override
	public LinkedList tail() {
		throw new RuntimeException("Called tail on an empty list.");
	}

	@Override
	public boolean isEmpty() {
		return true;
	}

	@Override
	public int length() {
		return 0;
	}

	@Override
	public boolean member(int e) {
		return false;
	}

	@Override
	public LinkedList delete(int e) {
		return this;
	}
	
	@Override
	public int indexOf(int e) {
		return -1;
	}
	@Override
	protected int indexOfInner(int e, int count) { return -1; }

	@Override
	public boolean equals(Object o) {
		return (o instanceof Nil);
	}

	@Override
	public String toString() {
		return "Nil";
	}
}
