package Polymorphism;

import java.util.Scanner;

public class TestBill{

	public static void main(String[] args) {
		int id;
		String Name;
		Bill result;
		
		Scanner sc = new Scanner(System.in);

		System.out.println("enter n:");
		int n = sc.nextInt();

		Bill b[] = new Bill[100];
		int amt[] = new int[5];

		for (int i = 0; i < n; i++) {
			System.out.println("Bill no:" + (i + 1));
			System.out.println("Bill Id ");
			id = sc.nextInt();
			System.out.println("Customer name:");
			Name = sc.next();
			System.out.println("How many amounts you want:");
			int no = sc.nextInt();
			for (int j = 0; j < no; j++)
				amt[j] = sc.nextInt();

			b[i] = new Bill(id, Name, amt);
		}

		while (true) {
			System.out.println(
					"1.search by Id \n2. Search by name \n3. delete by id \n4. delete by name \n5. display \n6. exit \n enter your choice:");
			int ch = sc.nextInt();
			switch (ch) {
			case 1:
				System.out.println("enter id:");
				id = sc.nextInt();

				result = Bill.search(b,n, id);
				if (result == null) {
					System.out.println("id not found");
				} else
					System.out.println(result);

				break;

			case 2:
				System.out.println("enter name:");
				Name = sc.next();

				result = Bill.search(b,n, Name);
				if (result == null) {
					System.out.println("name not found");
				} else
					System.out.println(result);

				break;
			case 3:
				System.out.println("enter id:");
				id = sc.nextInt();
				n=Bill.delete(b,n,id);
				break;
			case 4:
				System.out.println("Customer name:");
				Name = sc.next();
				n=Bill.delete(b,n,Name);
				break;
			case 5:
				for (int j = 0; j < n; j++) {
					System.out.println(b[j]);
				}
				break;
			case 6:
				System.exit(0);
			default:
				System.out.println("INVALID CHOICE....");
				break;
			}
		}

	}

}