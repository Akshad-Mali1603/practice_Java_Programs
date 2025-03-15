
public class Person {
	protected int age;
	protected String name,address,mob,dob;
	@Override
	public String toString() {
		return "Person [age=" + age + ", name=" + name + ", address=" + address + ", mob=" + mob + ", dob=" + dob + "]";
	}
	public Person(int age, String name, String address, String mob, String dob) {
		super();
		this.age = age;
		this.name = name;
		this.address = address;
		this.mob = mob;
		this.dob = dob;
	}
	public Person() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getMob() {
		return mob;
	}
	public void setMob(String mob) {
		this.mob = mob;
	}
	public String getDob() {
		return dob;
	}
	public void setDob(String dob) {
		this.dob = dob;
	}
	
	
	
	
}
