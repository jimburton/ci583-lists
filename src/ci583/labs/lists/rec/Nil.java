package ci583.labs.lists.rec;

public class Nil extends LinkedList {

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
	public LinkedList delete(int e) {
		throw new UnsupportedOperationException("Method not implemented");
	}
	
	@Override
	public int indexOf(int e) {
		throw new UnsupportedOperationException("Method not implemented");
	}
	@Override
	protected int indexOfInner(int e, int count) { throw new UnsupportedOperationException("Method not implemented");}

	@Override
	public boolean equals(Object o) {
		return (o instanceof Nil);
	}

	@Override
	public String toString() {
		return "";
	}
}
