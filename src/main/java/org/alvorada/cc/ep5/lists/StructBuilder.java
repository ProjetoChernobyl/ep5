package org.alvorada.cc.ep5.lists;

import org.alvorada.cc.ep5.Main;
import org.alvorada.cc.ep5.domain.Node;

public class StructBuilder {

	public Node[] stringToLinkedListInsideArray(String genomaLine) {
		
		int lineSize = genomaLine.length();
		Node[] nodes = new Node[lineSize];
		
		
		for (int i = lineSize-1; i >= 0; i--) {
			nodes[i] = new Node(genomaLine.charAt(i));
			Main.rootNode.addInTheBeginning(nodes[i]);
		}
		return nodes;
	}
}
