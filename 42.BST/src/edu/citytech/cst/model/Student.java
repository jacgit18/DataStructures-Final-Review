package edu.citytech.cst.model;

public class Student implements Comparable<Student> {

	
	private String Firstname;
	private String Lastname;
	private float gpa;
	
	public Student () {} // makes object o legal
	
	
	public Student(String firstname, String lastname, float gpa) {
		super();
		this.Firstname = firstname;
		this.Lastname = lastname;
		this.gpa = gpa;
	}

	
	
// on test 0 =  equal to , negative less than, positive grater 
//	implement a compare
	
	@Override
	public int compareTo(Student o) {

//		String name = this.Lastname + this.Firstname;
//		String inputName = o.Lastname + o.Firstname;
//		int status = name.compareTo(inputName);
//		
//		
//		return status;
		
		
		float gpa1 = this.gpa;
		float gpa2 = o.gpa;
		int status = Float.compare(gpa1, gpa2);
		return status;
	}
	
	
}
