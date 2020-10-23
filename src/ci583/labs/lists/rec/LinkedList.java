package ci583.labs.lists.rec;

public abstract class LinkedList {

	/**
	 * The cons method returns a new ListItem with e as its head and the current list as its tail.
	 * @param e
	 * @return
	 */
	public LinkedList cons(int e) {
		throw new UnsupportedOperationException("Method not implemented");
	}
	/**
	 * The length method returns the length of a LinkedList. Write a recursive function 
	 * that returns 0 for the length of a Nil item. For a ListItem element, the function
	 * should return 1 plus the sum of calling length recursively on the tail of the list. 
	 * @return
	 */
	public abstract int length();
	/**
	 * The member function returns true if e is in the list, false otherwise. Write your 
	 * function recursively. So, nothing is a member of Nil, and an element is a member of
	 * a ListItem element if it is the data item of that element OR it is a member of the 
	 * tail of that element.
	 * @param e
	 * @return
	 */
	public abstract boolean member(int e);
	/**
	 * The isEmpty method is always false for Nil items and always true otherwise.
	 * @return
	 */
	public abstract boolean isEmpty();
	/**
	 * The indexOf method returns the position of an element in the list, or -1 if the
	 * element is not found. Use the indexOfInner helper method to write indexOf recursively.
	 * So, when indexOf is called on a ListItem, it should call indexOfInner with count equal
	 * to 0. Inside indexOfInner, return count if e is equal to the data item of the element, 
	 * or call indexOfInner with count equal to count+1. Calling indexOf or indexOfInner on a 
	 * Nil item should return -1.
	 * @param e
	 * @return
	 */
	public abstract int indexOf(int e);
	protected abstract int indexOfInner(int e, int count);
	/**
	 * The delete method returns a copy of the list with element e removed. Calling delete on a 
	 * Nil item returns the item itself. When we call delete on a ListItem, it should either return 
	 * the tail of the item (if the data of this item is equal to e) or, otherwise, a new ListItem 
	 * made up of the head of this item and the result of calling delete recursively on the tail.
	 * @param e
	 * @return
	 */
	public abstract LinkedList delete(int e);
	/**
	 * The head method is a getter for the head element and is implemented for you. Calling head
	 * on an empty list gives a runtime exception.
	 * @return
	 */
	public abstract int head();
	/**
	 * The tail method is a getter for the tail of a list and is implemented for you. Calling tail
	 * on an empty list gives a runtime exception.
	 * @return
	 */
	public abstract LinkedList tail();

}
