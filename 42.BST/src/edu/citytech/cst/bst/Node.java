package edu.citytech.cst.bst;

class Node <T> {
// just class to hide from the world
	T parent;
	Node<T> left, right; 
	
	
	public Node(T parent, Node<T> left, Node<T> right) {
		super();
		this.parent = parent;
		this.left = left;
		this.right = right;
	}

	public Node (T f) {
		this.parent = f;
	}


	@Override
	public String toString() {
		return "N [L = " + left + " ,P = " + parent + " R = " + right + " ]";
	}
}
