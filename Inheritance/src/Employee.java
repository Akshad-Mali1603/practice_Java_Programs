
public class Employee extends Person {
		
	private int id;
	private String dept;
	private float salary;
	@Override
	public String toString() {
		return "Employee [id=" + id + ", dept=" + dept + ", salary=" + salary + ", toString()=" + super.toString()
				+ "]";
	}
	public Employee(int age, String name, String address, String mob, String dob, int id, String dept, float salary) {
		super(age, name, address, mob, dob);
		this.id = id;
		this.dept = dept;
		this.salary = salary;
	}
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
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
	public float getSalary() {
		return salary;
	}
	public void setSalary(float salary) {
		this.salary = salary;
	}
	
}
