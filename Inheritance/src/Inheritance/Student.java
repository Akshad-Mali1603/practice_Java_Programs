package Inheritance;

public class Student {
	private int id;
	private	String name;
	private	String dateofbirth;
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Student(int id, String name, String dateofbirth) {
		super();
		this.id = id;
		this.name = name;
		this.dateofbirth = dateofbirth;
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
	public String getDateofbirth() {
		return dateofbirth;
	}
	public void setDateofbirth(String dateofbirth) {
		this.dateofbirth = dateofbirth;
	}

}
