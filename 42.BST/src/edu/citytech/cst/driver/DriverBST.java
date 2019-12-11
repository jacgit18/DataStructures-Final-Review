package edu.citytech.cst.driver;

import edu.citytech.cst.bst.BST;
import edu.citytech.cst.model.Employee;
import edu.citytech.cst.model.Student;

public class DriverBST {

	public static void main(String[] args) {
		// find out how to  display data

//		BST<String> bst = new BST<>();
//		BST<Float> bstf = new BST<>();
//		BST<Integer> bsti = new BST<>();
//		BST<Double> bstd = new BST<>();
//		BST <Student> bsts = new BST<>();
//	
//		Student a, b;
		
		// duplicates arent allowed here
		
		float numbers[] = {
				10,5,20,30,100,1,2,3,4,11
		};
		BST<Float> bst = new BST<>();
		for (float f : numbers) {
			bst.insert(f);
		}
		
		
		
		Employee emp[] = {new Employee("HH100", 1000f),
				          new Employee("BB100", 7000f),
				          new Employee("CC100", 500f),
				          new Employee("DD100", 1500f),

				
				};
		
		BST<Employee> bstEmp = new BST<>();
		
		for (Employee employee : emp) {
			bstEmp.insert(employee);
			
		}
	}
	
	

}
