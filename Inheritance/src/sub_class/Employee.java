package sub_class;

import super_class.Person;

public class Employee extends Person {
	private int id;
	private String dept;
	private float basicSalary;
	private String pfaccno;
	private float tax;
		public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Employee(int id, String dept, float basicSalary, String pfaccno, float tax) {
		super();
		this.id = id;
		this.dept = dept;
		this.basicSalary = basicSalary;
		this.pfaccno = pfaccno;
		this.tax = tax;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	public float getBasicSalary() {
		return basicSalary;
	}
	public void setBasicSalary(float basicSalary) {
		this.basicSalary = basicSalary;
	}
	public String getPfaccno() {
		return pfaccno;
	}
	public void setPfaccno(String pfaccno) {
		this.pfaccno = pfaccno;
	}
	public float getTax() {
		return tax;
	}
	public void setTax(float tax) {
		this.tax = tax;
	}
}
