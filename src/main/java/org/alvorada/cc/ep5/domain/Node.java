package org.alvorada.cc.ep5.domain;

public class Node {

	public static int id = 0;
	public char value;
	private Node next = null;
	private Node previous = null;
	private Node first = null;
	public Node last = null;
	int totalElements;

	@SuppressWarnings("static-access")
	public Node(Node next, char value) {
		this.next = next;
		this.value = value;
		this.id++;
	}

	@SuppressWarnings("static-access")
	public Node(char value) {
		this.value = value;
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

	public Node getPrevious() {
		return previous;
	}

	public void setPrevious(Node previous) {
		this.previous = previous;
	}

	public static int getId() {
		return id;
	}

	public String toString() {
		if (this.totalElements == 0) {
			return "[]";
		}
		StringBuilder builder = new StringBuilder("");
		Node current = first;

		while(current!=null) {
			builder.append(current.getValue());
			current = current.getNext();
		}
//		builder.append(current.getValue());
		builder.append("");

		return builder.toString();
	}

	public void addInTheBeginning(char genoma) {
		if (this.totalElements == 0) {
			Node newNode = new Node(genoma);
			this.first = newNode;
			this.last = newNode;
		} else {
			Node newNode = new Node(this.first, genoma);
			this.first.setPrevious(newNode);
			this.first = newNode;
		}
		this.totalElements++;
	}

	public void addInTheBeginning(Node node) {
		
		if (this.totalElements == 0) {
			this.first = node;
			this.last = node;
			this.next = node;
			this.previous = this;
		} else {
			node.setNext(first);
			node.setPrevious(this);
			this.first = node;
		}
		this.totalElements++;		
	}

	public int size() {
		return this.totalElements;
	}

	public String linkedListToString(Node[] node) {

		String result = "";
		for (int i = 0; i < node.length; i++) {
			result += node[i].getValue();
		}
		return result;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + value;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Node other = (Node) obj;
		if (value != other.value)
			return false;
		return true;
	}

}