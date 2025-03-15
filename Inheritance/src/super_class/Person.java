package super_class;

public class Person {
	private String name;
	private int age;
	private String mob;
	private String address;
	public Person() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Person(String name, int age, String mob, String address) {
		super();
		this.name = name;
		this.age = age;
		this.mob = mob;
		this.address = address;
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
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
}
