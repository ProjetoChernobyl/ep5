package org.alvorada.cc.ep5.lists;

import org.alvorada.cc.ep5.domain.Node;
import org.junit.Assert;
import org.junit.Test;

public class StructBuilderTest {
	
	StructBuilder classUnderTest = new StructBuilder();
	Node rootNodeTest = new Node('R');
	
	public Node[] initNodes(){
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
		
		rootNodeTest.setNext(nodes[0]);
		nodes[0].setNext(nodes[1]);
		nodes[1].setNext(nodes[2]);
		nodes[2].setNext(nodes[3]);
		nodes[3].setNext(nodes[4]);
		nodes[4].setNext(nodes[5]);
		nodes[5].setNext(nodes[6]);
		nodes[6].setNext(nodes[7]);
		nodes[7].setNext(nodes[8]);
		nodes[8].setNext(nodes[9]);		
		
		return nodes;
	}

	@Test
	public void testStringToLinkedListInsideArray() {
		
		String input = "TTGTCACATG";
		
		Node[] actuals = classUnderTest.stringToLinkedListInsideArray(input);
		Node[] expecteds = initNodes();
		
		Assert.assertArrayEquals(expecteds, actuals);
		
	}

}
