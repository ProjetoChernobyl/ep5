package org.alvorada.cc.ep5.lists;

import org.junit.Assert;
import org.junit.Test;

public class LinkedListTest {
	
	LinkedList classUnderTest = new LinkedList();
	
	
	@Test
	public void testChangeSubsequence() {
		int[] inverte = {3, 6};
		
		String actual = classUnderTest.changeSubsequence(inverte, "TTACTGCATG");
		String expected = "TTGTCACATG";
		
		Assert.assertEquals(expected, actual);
	}

}
