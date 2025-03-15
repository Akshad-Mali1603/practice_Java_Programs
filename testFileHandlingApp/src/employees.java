

public class employees {

	private Integer id;
	private String name;
	private Float salary;
	public employees() {
		super();
		// TODO Auto-generated constructor stub
	}
	public employees(Integer id, String name, Float salary) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Float getSalary() {
		return salary;
	}
	public void setSalary(Float salary) {
		this.salary = salary;
	}
	@Override
	public String toString() {
		return id +  name + salary;
	}
	
	
}
