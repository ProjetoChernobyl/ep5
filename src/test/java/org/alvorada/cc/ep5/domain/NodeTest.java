package org.alvorada.cc.ep5.domain;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class NodeTest {
	
	@Test
	public void testAddInTheBeginning(){
		Node add = new Node('Z');
		add.addInTheBeginning('U');
		
		String actual = add.toString();
		String expected = "U";
		
		assertEquals(expected, actual);
	}
	
	@Test
	public void testAddInTheBeginningMult(){
		Node add = new Node('Z');
		add.addInTheBeginning('U');
		add.addInTheBeginning('T');
		add.addInTheBeginning('J');
		add.addInTheBeginning('H');
		add.addInTheBeginning('U');
		System.out.println(add.totalElements);
		
		String actual = add.toString();
		String expected = "UHJTU";
		
		assertEquals(expected, actual);
	}
}