package sub_class;

import java.util.Scanner;

import super_class.Worker;

public class PartTime extends Worker {
	
	private float noOfHours;
	private float ratePerHour;
	
	public PartTime() {
		super();
		// TODO Auto-generated constructor stub
	}
	

	public PartTime(String name, int age, String mob, int id, float noOfHours, float ratePerHour) {
		super(name, age, mob, id);
		this.noOfHours = noOfHours;
		this.ratePerHour = ratePerHour;
	}
	


	public float getNoOfHours() {
		return noOfHours;
	}


	public void setNoOfHours(float noOfHours) {
		this.noOfHours = noOfHours;
	}


	public float getRatePerHour() {
		return ratePerHour;
	}


	public void setRatePerHour(float ratePerHour) {
		this.ratePerHour = ratePerHour;
	}


	@Override
	public void create() {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a ID: ");
		int id = sc.nextInt();
		System.out.println("Enter a Name: ");
		String name=sc.next();
		System.out.println("Enter a Mobile Number: ");
		String mob=sc.next();
		System.out.println("Enter a Age: ");
		int age = sc.nextInt();
		System.out.println("Enter a Extra Hours: ");
		this.noOfHours=sc.nextFloat();
		if(this.noOfHours != 0) {
			System.out.println("Enter a rate per Hours: ");
			this.ratePerHour=sc.nextFloat();
		}
		super.setId(id);
		super.setAge(age);
		super.setMob(mob);
		super.setName(name);
	}

	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println("ID: "+super.getId());
		System.out.println("Name: "+super.getName());
		System.out.println("Mobile Number: "+super.getMob());
		System.out.println("Age: "+super.getAge());
		System.out.println("Extra Hours: "+this.noOfHours);
		if(this.noOfHours != 0) {
			System.out.println("Enter a Rate Per Hours: "+this.ratePerHour);
		}
	
	}
	
	@Override
	public float getSalary() {
		
		return this.noOfHours*this.ratePerHour;
	}

	@Override
	public void update(int choice, Object data) {
		switch (choice) {
		case 1:
			super.setName(data.toString());
			break;
		
		case 2:
			super.setAge((int)data);
			break;
			
		case 3:
			super.setMob(data.toString());
			break;
		case 4:
			this.noOfHours=(int)data;
			break;
		
		case 5:
			this.ratePerHour=(float)data;
			break;
		
			
		default:
			System.out.println("Invalid Choice !!!");
			break;
		}

	}

}
