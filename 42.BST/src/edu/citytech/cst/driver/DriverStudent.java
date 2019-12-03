package edu.citytech.cst.driver;

import edu.citytech.cst.model.Student;

public class DriverStudent {

	public static void main(String[] args) {

		
//		Student s1 = new Student("Josh","Carp", 4.00f );
//		Student s2 = new Student("Joshua","Carpentier", 3.00f );
		
		Student s1 = new Student("Jean","boulet", 3.75f );
		Student s2 = new Student("david","banner", 4.75f );
		int status = s1.compareTo(s2);
		System.out.println(status);
		
	}

}
