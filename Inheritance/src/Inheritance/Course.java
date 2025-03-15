package Inheritance;

public class Course {
	int id;
	String name;
	String duration;
	float fees;
	public Course(int id, String name, String duration, float fees) {
		super();
		this.id = id;
		this.name = name;
		this.duration = duration;
		this.fees = fees;
	}
	public Course() {
		super();
		// TODO Auto-generated constructor stub
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
	public String getDuration() {
		return duration;
	}
	public void setDuration(String duration) {
		this.duration = duration;
	}
	public float getFees() {
		return fees;
	}
	public void setFees(float fees) {
		this.fees = fees;
	}
	
}
