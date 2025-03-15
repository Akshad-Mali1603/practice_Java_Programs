package sub_class;

import other.Address;
import other.PhoneNumber;
import super_class.Person;

public class Employee extends Person {
	private int empId;
	private String empDept;
	private float empSalary;
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Employee(String name, int age, PhoneNumber phno, Address address, int empId, String empDept,
			float empSalary) {
		super(name, age, phno, address);
		this.empId = empId;
		this.empDept = empDept;
		this.empSalary = empSalary;
	}
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getEmpDept() {
		return empDept;
	}
	public void setEmpDept(String empDept) {
		this.empDept = empDept;
	}
	public float getEmpSalary() {
		return empSalary;
	}
	public void setEmpSalary(float empSalary) {
		this.empSalary = empSalary;
	}
	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empDept=" + empDept + ", empSalary=" + empSalary + ", toString()="
				+ super.toString() + "]";
	}
	
	
	
}
