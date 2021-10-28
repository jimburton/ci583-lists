package ci583.labs.test;

import ci583.labs.lists.LinkedList;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class LinkedListTest {

	/**
	 * Check that a singleton list has a head and no tail.
	 */
	@Test
	public void testHeadAndTail() {
		LinkedList list = new LinkedList();
		list.cons(1);
		assertEquals(list.head(), 1);
		assertNull(list.tail());
	}

	/**
	 * Check that length reflects the real length.
	 */
	@Test
	public void testConsAndLength() {
		LinkedList list = new LinkedList();
		assertEquals(list.length(), 0);
		list.cons(1);
		assertEquals(list.length(), 1);
	}

	/**
	 * Test that member works.
	 */
	@Test
	public void testMember() {
		LinkedList list = new LinkedList();
		for (int i = 0; i < 10; i++) {
			list.cons(i);
		}
		assertTrue(list.member(1));
		assertFalse(list.member(10));
	}

	/**
	 * Test isEmpty.
	 */
	@Test
	public void testIsEmpty() {
		LinkedList list = new LinkedList();
		assertTrue(list.isEmpty());
		list.cons(99);
		assertFalse(list.isEmpty());
	}

	/**
	 * Test indexOf.
	 */
	@Test
	public void testIndexOf() {
		LinkedList list = new LinkedList();
		for (int i = 9; i >= 0; i--) {
			list.cons(i);
		}
		System.out.println(list);
		assertEquals(list.indexOf(0), 0);
		assertEquals(list.indexOf(5), 5);
		assertEquals(list.indexOf(99), -1);
	}

	/**
	 * Test the delete method.
	 */
	@Test
	public void testDelete() {
		LinkedList list = new LinkedList();
		for (int i = 0; i < 10; i++) {
			list.cons(i);
		}

		list.delete(5);
		assertFalse(list.member(4));
		assertEquals(list.length(), 9);
	}
}
