package org.alvorada.cc.ep5.domain;

public class Node {

	public static int id = 0;
	public char value;
	private Node next;
	private Node previous;
	private Node first;
	private Node last;
	int totalElements;

	@SuppressWarnings("static-access")
	public Node(char value) {
		this.next = null;
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

		for (int i = 0; i < this.totalElements - 1; i++) {
			builder.append(current.getValue());
			builder.append("");
			current = current.getNext();
		}
		builder.append(current.getValue());
		builder.append("");

		return builder.toString();
	}

	public void addInTheBeginning(char genoma) {
		if (this.totalElements == 0) {
			Node nova = new Node(genoma);
			this.first = nova;
			this.last = nova;
			this.totalElements++;
		} else {
			Node nova = new Node(genoma);
			this.last.setNext(nova);
			nova.setPrevious(this.last);
			this.last = nova;
			this.totalElements++;
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

}
