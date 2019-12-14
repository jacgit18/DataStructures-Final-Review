package edu.citytech.cst.model;

public class Employee implements Comparable<Employee> {

	private String id;
	private float salary;
	
	
	public Employee(String id, float salary) {
		super();
		this.id = id;
		this.salary = salary;
	}


	public String getId() {
		return id;
	}


	public float getSalary() {
		return salary;
	}


	// compare id coming in from driver overiding comparable
	@Override
	public int compareTo(Employee o) {
		int status = id.compareTo(o.id);
		
		return status;
	}


	@Override
	public String toString() {
		return "Employee [id=" + id + ", salary=" + salary + "]";
	}
	
	
	
	
}
