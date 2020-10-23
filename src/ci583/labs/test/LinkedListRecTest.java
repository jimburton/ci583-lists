package ci583.labs.test;

import org.junit.Before;
import org.junit.Test;

import ci583.labs.lists.rec.LinkedList;
import ci583.labs.lists.rec.Nil;

import static org.junit.Assert.*;

public class LinkedListRecTest {

	@Before
	public void setUp() throws Exception {
	}
	
	@Test
	public void testHeadAndTail() {
		LinkedList list = new Nil().cons(1);
		assertEquals(list.head(), 1);
		assertEquals(list.tail(), new Nil());
	}

	@Test
	public void testConsAndLength() {
		LinkedList list = new Nil();
		assertEquals(list.length(), 0);
		list = list.cons(1);
		assertEquals(list.length(), 1);
	}

	@Test
	public void testMember() {
		LinkedList list = new Nil();
		for (int i = 0; i < 10; i++) {
			list = list.cons(i);
		}
		assertTrue(list.member(1));
		assertFalse(list.member(10));
	}

	@Test
	public void testIsEmpty() {
		LinkedList list = new Nil();
		assertTrue(list.isEmpty());
		list = list.cons(99);
		assertFalse(list.isEmpty());
	}

	@Test
	public void testIndexOf() {
		LinkedList list = new Nil();
		for (int i = 9; i >= 0; i--) {
			list = list.cons(i);
		}
		System.out.println(list);
		assertEquals(list.indexOf(5), 5);
		assertEquals(list.indexOf(99), -1);
	}

	@Test
	public void testDelete() {
		LinkedList list = new Nil();
		for (int i = 0; i < 10; i++) {
			list = list.cons(i);
		}

		list = list.delete(5);
		assertFalse(list.member(5));
		assertEquals(list.length(), 9);

		assertEquals(list.delete(99), list);

	}

}