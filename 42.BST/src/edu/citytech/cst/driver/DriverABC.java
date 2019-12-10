package edu.citytech.cst.driver;

import edu.citytech.cst.bst.BST;

public class DriverABC {

	public static void main(String[] args) {

		String abc[] = {"H","A","B","C","D","E","F","I"};
		BST<String> bst = new BST<>();
		int searchCount = 0;
		
		for (String string : abc) {
			searchCount++;
//			bst.insert(string);
			if (string.equals("I")) 
				break;
		}
		
		// Alternative
		for (String string : abc) {
			bst.insert(string);
			
		}
		
		System.out.println("Linear Search Count " + searchCount);
		searchCount = bst.search("I");
		System.out.println("Logrithmic Search Count " + searchCount);

		// binary tree for comparing hashmap for specific value
		//hash map is a dictionary
		// an array is imutable meaning you have wipe copy and create a new array to change array size
		// so you would use an arraylist
		
		
	}

}
