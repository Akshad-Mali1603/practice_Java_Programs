package oop;

public class Student {
	 
	private int roll;
	private String name;
	private float marks;
	public Student() {
		super();
		
	}
	public Student(int roll, String name, float marks) {
		super();
		this.roll = roll;
		this.name = name;
		this.marks = marks;
	}
	public int getRoll() {
		return roll;
	}
	public void setRoll(int roll) {
		this.roll = roll;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public float getMarks() {
		return marks;
	}
	public void setMarks(float marks) {
		this.marks = marks;
	}
	public static Student search(Student s[],int roll) {
		for (int i = 0; i < s.length; i++) {
			if (s[i].roll==roll) {
				return s[i];
			} 
		}
		return null;
	}
	public static Student search(Student s[],String name) {
		for (int i = 0; i < s.length; i++) {
			if (s[i].name.compareToIgnoreCase(name)==0) {
				return s[i];
			} 
		}
		return null;
	}
	@Override
	public String toString() {
		return "Student [roll=" + roll + ", name=" + name + ", marks=" + marks + "]";
	}
	
}

