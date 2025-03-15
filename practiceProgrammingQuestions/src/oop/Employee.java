package oop;

public class Employee {
	
	private int id;
	private float salary;
	private String address,name,department;
	private int year;
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public float getSalary() {
		return salary;
	}
	public void setSalary(float salary) {
		this.salary = salary;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	
	
	@Override
	public String toString() {
		return "Employee [id=" + id + ", salary=" + salary + ", address=" + address + ", name=" + name + ", department="
				+ department + ", year=" + year + "]";
	}
	
	
	
	

}
