package super_class;

import other.Address;
import other.PhoneNumber;

public class Person {
	private String Name;
	private int Age;
	private PhoneNumber phno;
	private Address address;
	public Person() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Person(String name, int age, PhoneNumber phno, Address address) {
		super();
		Name = name;
		Age = age;
		this.phno = phno;
		this.address = address;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public int getAge() {
		return Age;
	}
	public void setAge(int age) {
		Age = age;
	}
	public PhoneNumber getPhno() {
		return phno;
	}
	public void setPhno(PhoneNumber phno) {
		this.phno = phno;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	@Override
	public String toString() {
		return "Person [Name=" + Name + ", Age=" + Age + ", phno=" + phno + ", address=" + address + "]";
	}
	
	
}
