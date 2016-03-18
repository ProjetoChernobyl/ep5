package org.alvorada.cc.ep5.util;

import org.junit.Assert;
<<<<<<< HEAD
import org.junit.Test;
=======

>>>>>>> a74d6e91bdd5c10c69d49fac4900cf841e308e44


public class ToolsTest {
	
	Tools classUnderTest = new Tools();

	@Test
	public void testStringToIntArray() {
		String group = "1 2 30 32 102 152";
		
		int[] actuals = classUnderTest.stringToIntArray(group);
		int[] expecteds = {1, 2, 30, 32, 102, 152};
		Assert.assertArrayEquals(expecteds, actuals);
	}

}
