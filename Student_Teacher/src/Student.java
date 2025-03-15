
public class Student {
	private int rollno;
	private String name;
	private String division;
	private float marks;
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Student(int rollno, String name, String division, float marks) {
		super();
		this.rollno = rollno;
		this.name = name;
		this.division = division;
		this.marks = marks;
	}
	public int getRollno() {
		return rollno;
	}
	public void setRollno(int rollno) {
		this.rollno = rollno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDivision() {
		return division;
	}
	public void setDivision(String division) {
		this.division = division;
	}
	public float getMarks() {
		return marks;
	}
	public void setMarks(float marks) {
		this.marks = marks;
	}
	@Override
	public String toString() {
		return "Student [rollno=" + rollno + ", name=" + name + ", division=" + division + ", marks=" + marks + "]";
	}
	
	
}
