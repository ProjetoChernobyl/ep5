package org.alvorada.cc.ep5.lists;

import org.alvorada.cc.ep5.domain.Node;

public class LinkedListTest {
	
	LinkedList classUnderTest = new LinkedList();
	Node rootNodeTest = new Node('R');
	
	/** 
	 * Cria um array de nodes com a posição TTACTGCATG
	 * 
	 * EXEMPLOS DO SLIDE
	 * ordem inicial
	 * ordem inicial: TT ACTG CATG
	 * ordem final  : TT GTCA CATG
	 * os espaços são apenas para evidanciar a troda o arquivo não tem eles
	 * return Node[]
	 * */
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
	public void testChangeSubsequenceSchemaTwoArray() {
		int[] inverte = {3, 6};
		Node[] nodes = initNodes(rootNodeTest);
		
		Node[] actuals = classUnderTest.changeSubsequenceSchemaTwo(inverte, nodes, new Node('R'));
		Node[] expecteds = nodes;
		Assert.assertArrayEquals(expecteds, actuals);
	}
	
	@Test
	public void testChangeSubsequenceSchemaTwotoString() {
		Node node = new Node('R');
		int[] inverte = {3, 6};
		Node[] nodes = initNodes(node);
				
		classUnderTest.changeSubsequenceSchemaTwo(inverte, nodes, node);
		String actual1 = node.toString();
		//ordem inicial:    TTACTGCATG
		String expected1 = "TTGTCACATG";
		
		Assert.assertEquals(expected1, actual1);
	}
	
	@Test
	public void testChangeSubsequenceSchemaTwoSamePositionBeginAndEnd() {
		Node node = new Node('R');
		int[] inverte = {3, 3};
		Node[] nodes = initNodes(node);
				
		classUnderTest.changeSubsequenceSchemaTwo(inverte, nodes, node);
		String actual1 = node.toString();
		//ordem inicial:    TTACTGCATG
		String expected1 = "TTACTGCATG";
		
		Assert.assertEquals(expected1, actual1);
	}
	
	@Test
	public void testChangeInitialPosition(){
		Node node = new Node('R');
		int[] inverte = {1, 4};
		Node[] nodes = initNodes(node);
				
		classUnderTest.changeInitialPosition(0, 3, nodes, node);
		String actual = node.toString();
		//ordem inicial:   TTACTGCATG
		String expected = "CATTTGCATG";
		
		Assert.assertEquals(expected, actual);
	}
	
	@Test
	public void testChangeLastPosition(){
		Node node = new Node('R');
		int[] inverte = {7, 10};
		Node[] nodes = initNodes(node);
				
		classUnderTest.changeSubsequenceSchemaTwo(inverte, nodes, node);
		String actual = node.toString();
		//ordem inicial:   TTACTGCATG
		String expected = "TTACTGGTAC";
		
		Assert.assertEquals(expected, actual);
	}
	
}
