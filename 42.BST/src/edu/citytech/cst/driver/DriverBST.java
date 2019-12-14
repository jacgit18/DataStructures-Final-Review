package edu.citytech.cst.driver;

import java.util.Arrays;
import java.util.stream.Stream;

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
		
		
		
		Stream<Employee> data = Arrays.stream(emp);
		long size = data.filter(e -> e.getSalary() > 1000).count();
		
		System.out.println("Size " + size);
		
		//or 
		
		int othersize = 0;
		for (Employee employee : emp) {
			if (employee.getSalary() > 1000) {
				othersize++;
			}
		}
		
		System.out.println("Other size " + othersize);

		
		BST<Employee> bstEmp = new BST<>();
		
		for (Employee employee : emp) {
			bstEmp.insert(employee);
//			System.out.println(employee);
			
		}
		
		int search = bstEmp.search(new Employee("DD100", 1500f));
		System.out.println(search);
		//4 is the number ofsteps thing about binary tree
		// multiple choice part not open book
	}
	
	

}
