package org.alvorada.cc.ep5.util;

import org.junit.Assert;


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
