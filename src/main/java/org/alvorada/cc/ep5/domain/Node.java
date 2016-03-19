package org.alvorada.cc.ep5.domain;

public class Node {
	
	public static int id  = 0;
	public char value;
	private Node next;
	
	@SuppressWarnings("static-access")
	public Node(char value){
		this.value = value;
		this.next = null;
		this.id++;
	}

	public char getValue() {
		return value;
	}

	public void setValue(char value) {
		this.value = value;
	}

	public Node getNext() {
		return next;
	}

	public void setNext(Node next) {
		this.next = next;
	}

	public static int getId() {
		return id;
	}
	
	public String linkedListToString(Node[] node) {
		
		String result = "";
		for (int i = 0; i < node.length; i++) {
			result += node[i].getValue();
		}
		return result;
	}
	
}
