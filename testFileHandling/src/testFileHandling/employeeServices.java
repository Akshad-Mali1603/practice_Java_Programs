package testFileHandling;

import java.io.File;
import java.util.Scanner;

public class employeeServices {
//	public static void main(String[]args) {
//		fileInsert();
//	}
	public static void fileInsert() {

		String fname;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the file name: ");
		fname = sc.next();

		try (Scanner fn = new Scanner(new File(fname))) {

			while (fn.hasNextLine()) {

				System.out.println(fn.nextLine());
			}

		} catch (Exception e) {
			// TODO: handle exception
			e.getStackTrace();
		}
		sc.close();
	}

}
