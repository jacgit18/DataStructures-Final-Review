package edu.citytech.cst.driver;

import edu.citytech.cst.bst.Node;

public class DriverNode {

	public static void main(String[] args) {

		Float parent = 8f;
		Node<Float> left = new Node<>(4f);
		Node<Float> right = new Node<>(12f);

		
		Node<Float> node = new Node<Float>(parent, left, right);
		System.out.println(node);
		
		
		String sparent = "tony";
		Node <String> s1 = new Node<>("Peter");
		Node <String> s2 = new Node<>("David");

		Node<String> alterEgo = new Node <>(sparent, s1, s2);
		System.out.println(alterEgo);
	
	}

}
