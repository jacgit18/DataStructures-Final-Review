package edu.citytech.cst.bst;

class Node <T> {

	int left; 
	int parent;
	int right;
	
	
	
	@Override
	public String toString() {
		return "Node [left = " + left + " ,parent = " + parent + "right = " + right + " ]";
	}
}
