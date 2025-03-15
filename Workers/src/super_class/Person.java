package super_class;

public class Person {
	private String name;
	private int age;
	private String mob;
	public Person() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Person(String name, int age, String mob) {
		super();
		this.name = name;
		this.age = age;
		this.mob = mob;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getMob() {
		return mob;
	}
	public void setMob(String mob) {
		this.mob = mob;
	}
	
}
