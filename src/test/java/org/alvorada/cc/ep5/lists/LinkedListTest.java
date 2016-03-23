package org.alvorada.cc.ep5.lists;

import org.alvorada.cc.ep5.domain.Node;
import org.junit.Assert;
import org.junit.Test;

public class LinkedListTest {
	
	LinkedList classUnderTest = new LinkedList();
	Node rootNodeTest = new Node('R');
	
	public Node[] initNodes(Node node){
		Node[] nodes = new Node[10];
		nodes[0] = new Node('T');
		nodes[1] = new Node('T');
		nodes[2] = new Node('A');
		nodes[3] = new Node('C');
		nodes[4] = new Node('T');
		nodes[5] = new Node('G');
		nodes[6] = new Node('C');
		nodes[7] = new Node('A');
		nodes[8] = new Node('T');
		nodes[9] = new Node('G');
		
		node.addInTheBeginning(nodes[9]);
		node.addInTheBeginning(nodes[8]);
		node.addInTheBeginning(nodes[7]);
		node.addInTheBeginning(nodes[6]);
		node.addInTheBeginning(nodes[5]);
		node.addInTheBeginning(nodes[4]);
		node.addInTheBeginning(nodes[3]);
		node.addInTheBeginning(nodes[2]);
		node.addInTheBeginning(nodes[1]);
		node.addInTheBeginning(nodes[0]);
		return nodes;
	}
	
	@Test
	public void testChangeSubsequenceSchemaOneArray() {
		int[] inverte = {3, 6};
		Node[] nodes = initNodes(rootNodeTest);
		
		Node[] actuals = classUnderTest.changeSubsequenceSchemaOne(inverte, nodes);
		Node[] expecteds = nodes;
		Assert.assertArrayEquals(expecteds, actuals);
	}
	
	public void testChangeSubsequenceSchemaOnetoString() {
		Node node = new Node('R');
		int[] inverte = {3, 6};
		Node[] nodes = initNodes(node);
		
		classUnderTest.changeSubsequenceSchemaOne(inverte, nodes);
		String actual1 = node.toString();
		String expected1 = "TTGTCACATG";
		
		Assert.assertEquals(expected1, actual1);
	}
	
	@Test
	public void testChangeSubsequenceSchemaTwotoString() {
		Node node = new Node('R');
		int[] inverte = {3, 6};
		Node[] nodes = initNodes(node);
				
		classUnderTest.changeSubsequenceSchemaTwo(inverte, nodes);
		String actual1 = node.toString();
		String expected1 = "TTGTCACATG";
		
		Assert.assertEquals(expected1, actual1);
	}
}







