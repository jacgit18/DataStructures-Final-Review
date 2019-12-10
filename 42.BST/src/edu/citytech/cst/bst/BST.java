package edu.citytech.cst.bst;

public class BST<T extends Comparable<T>> {

	private Node<T> root;

	public void insert(T data) {
		root = newEntry(root, data);
	}
	
	private int size = 0;
	
	private Node<T> newEntry(Node<T> node, T newNode) {
		
		if (node == null) {
			return new Node<T>(newNode);
		}
		
		size ++;

		int status = newNode.compareTo(node.data);

		if (status == 0)
			return node;
		if (status < 0)
			node.left = newEntry(node.left, newNode);
		else
			node.right = newEntry(node.right, newNode);

		return node;
	}
	
	private int searchCount;
	
	public int search(T toSearch) {
		return search(root, toSearch);
	}	

	private int search(Node<T> p, T toSearch) {
	    searchCount++;
		if (p == null)
			return 0;
		
		int status = toSearch.compareTo(p.data);
		if (status == 0)
			return searchCount;
		else if (status < 0)
			return search(p.left, toSearch);
		else
			return search(p.right, toSearch);
	}	
	
	int getSize() {
		return this.size;
	}

	@Override
	public String toString() {
		return "BST [root=" + root + ", size=" + size + ", searchCount=" + searchCount + "]";
	}	
}