package sub_class;

import java.util.Scanner;

import super_class.Worker;

public class FullTime extends Worker {

		private float salary;
		private float extraHours;
		private float ratePerHour=0;
		
		
	public FullTime() {
			super();
			// TODO Auto-generated constructor stub
		}

	public FullTime(String name, int age, String mob, int id, float salary, float extraHours, float ratePerHour) {
		super(name, age, mob, id);
		this.salary = salary;
		this.extraHours = extraHours;
		this.ratePerHour = ratePerHour;
	}
	

	public float getExtraHours() {
		return extraHours;
	}

	public void setExtraHours(float extraHours) {
		this.extraHours = extraHours;
	}

	public float getRatePerHour() {
		return ratePerHour;
	}

	public void setRatePerHour(float ratePerHour) {
		this.ratePerHour = ratePerHour;
	}

	public void setSalary(float salary) {
		this.salary = salary;
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
		System.out.println("Enter a Salary: ");
		this.salary=sc.nextFloat();
		System.out.println("Enter a Extra Hours: ");
		this.extraHours=sc.nextFloat();
		if(this.extraHours != 0) {
			System.out.println("Enter a Rate Per Hours: ");
			this.ratePerHour=sc.nextFloat();
		}
		super.setId(id);
		super.setAge(age);
		super.setMob(mob);
		super.setName(name);
		
	}

	@Override
	public void display() {
		System.out.println("ID: "+super.getId());
		System.out.println("Name: "+super.getName());
		System.out.println("Mobile Number: "+super.getMob());
		System.out.println("Age: "+super.getAge());
		System.out.println("Salary: "+this.salary);
		System.out.println("Extra Hours: "+this.extraHours);
		if(this.extraHours != 0) {
			System.out.println("Enter a Rate Per Hours: "+this.ratePerHour);
		}
	
	}

	@Override
	public void update(int choice,Object data) {
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
			this.salary=(float)data;
			break;
			
		case 5:
			this.extraHours=(int)data;
			break;
		
		case 6:
			this.ratePerHour=(float)data;
			break;
		
			
		default:
			System.out.println("Invalid Choice !!!");
			break;
		}
		
	}

	@Override
	public float getSalary() {
		
		return this.salary+(this.extraHours*this.ratePerHour);
	}

}
