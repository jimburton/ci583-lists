package ci583.labs.test;

import ci583.labs.lists.LinkedList;
import ci583.labs.lists.Set;
import org.junit.Test;

import static org.junit.Assert.*;

public class SetTest {

	/**
	 * Check that insert doesn't allow duplicates.
	 */
	@Test
	public void testDupes () {
		Set s = new Set();
		s.insert (1);
		s.insert (1);
		assertEquals(s.length(), 1);
	}

	/**
	 * Check that insert actually inserts.
	 */
	@Test
	public void testInsert () {
		Set s = new Set();
		for(int i=0;i<10;i++) {
			s.insert(i);
		}
		for(int i=0;i<10;i++) {
			assertTrue(s.member(i));
		}
	}
	/**
	 * Check that intersection produces the right set.
	 */
	@Test
	public void testIntersection () {
		var s1 = new Set();
		var s2 = new Set();
		var s3 = new Set();
		for(int i=0;i<10;i++) {
			s1.insert(i);
		}
		for(int i=5;i<15;i++) {
			s2.insert(i);
		}
		s3 = s1.intersection(s2);
		//intersection should be {5, 6, 7, 8, 9}
		var s4 = new Set();
		for(int i=5;i<10;i++) {
			s4.insert(i);
		}
		assertEquals(s3, s4);
	}

	/**
	 * Check that union produces the right set.
	 */
	@Test
	public void testUnion () {
		var s1 = new Set();
		var s2 = new Set();
		var s3 = new Set();
		for(int i=0;i<10;i++) {
			s1.insert(i);
		}
		for(int i=5;i<15;i++) {
			s2.insert(i);
		}
		s3 = s1.union(s2);
		//union should be {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14}
		var s4 = new Set();
		for(int i=0;i<15;i++) {
			s4.insert(i);
		}
		assertEquals(s3, s4);
	}

	/**
	 * Check that difference produces the right set.
	 */
	@Test
	public void testDifference () {
		var s1 = new Set();
		var s2 = new Set();
		var s3 = new Set();
		for(int i=0;i<10;i++) {
			s1.insert(i);
		}
		for(int i=5;i<15;i++) {
			s2.insert(i);
		}
		s3 = s1.difference(s2);
		//difference should be {0, 1, 2, 3, 4}
		var s4 = new Set();
		for(int i=0;i<5;i++) {
			s4.insert(i);
		}
		assertEquals(s3, s4);
	}

}
