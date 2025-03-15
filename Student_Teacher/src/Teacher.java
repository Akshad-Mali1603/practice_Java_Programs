
public class Teacher {
	private int id;
	private String name;
	private String subject;
	private String department;
	private float exp;
	private float salary;
	public Teacher() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Teacher(int id, String name, String subject, String department, float exp, float salary) {
		super();
		this.id = id;
		this.name = name;
		this.subject = subject;
		this.department = department;
		this.exp = exp;
		this.salary = salary;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public float getExp() {
		return exp;
	}
	public void setExp(float exp) {
		this.exp = exp;
	}
	public float getSalary() {
		return salary;
	}
	public void setSalary(float salary) {
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Teacher [id=" + id + ", name=" + name + ", subject=" + subject + ", department=" + department + ", exp="
				+ exp + ", salary=" + salary + "]";
	}

}
