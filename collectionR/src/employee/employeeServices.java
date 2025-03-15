package employee;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class employeeServices {
	
	Map<Integer, Object> empHash= new HashMap<Integer,Object>();
	Employee emp= new Employee();
	Scanner sc= new Scanner(System.in);
	
	public Map<Integer, Object> Insert() {
		
		System.out.println("Enter the Id: ");
		int id=sc.nextInt();
		System.out.println("Enter the name: ");
		String name= sc.next();
		System.out.println("Enter the Salary: ");
		float salary= sc.nextFloat();
		
		emp= new Employee(name, salary);
		
		empHash.put(id, emp);
		return empHash;
	}
	
	public void removeEmp() {
		if (empHash.isEmpty()) {
			System.out.println("No record Found");
		}else {
			System.out.println("Enter the id: ");
			int id=sc.nextInt();
			for (Map.Entry<Integer, Object> entry : empHash.entrySet()) {
				Integer key = entry.getKey();
				Object val = entry.getValue();
				if (key.equals(id)) {
					empHash.remove(key);
				}
			}
		}
	}
	
	public void Display() {
		System.out.println("The record sof employees-->");
		if (empHash.isEmpty()) {
			System.out.println("No records found !!");
		}else {
			for (Map.Entry<Integer, Object> entry : empHash.entrySet()) {
				Integer key = entry.getKey();
				Object val = entry.getValue();
				System.out.println("Id: "+key +":\n"+val);
			}
		}
	}
}
