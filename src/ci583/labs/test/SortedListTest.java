package ci583.labs.test;

import ci583.labs.lists.LinkedList;
import ci583.labs.lists.SortedList;
import org.junit.Before;
import org.junit.Test;

import java.util.Random;

import static org.junit.Assert.assertEquals;

public class SortedListTest {

	/**
	 * Test that data is sorted.
	 */
	@Test
	public void testInsert() {
		SortedList list = new SortedList();
		assertEquals(list.length(), 0);
		list.insert(1);
		list.insert(99);
		assertEquals(list.head(), 1);
		
		//insert some random numbers and make sure they are in the right order.
		Random gen = new Random( 19580427 );
		
		for(int i=0;i<10;i++) {
			list.insert(gen.nextInt());
		}
		System.out.println(list);
		int prev = list.head();
		while(list != null) {
			assert(prev <= list.head());
			list = list.tail();
		}
	}

}
