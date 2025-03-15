package Assignment;

import java.util.Scanner;

public class TestRectangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rectangle you want to calculate area: ");
        int n =sc.nextInt();
        Rectangle[] rectangles = new Rectangle[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Enter for Rectangle " + (i + 1) + ":");
            System.out.print("Enter length: ");
            double length = sc.nextDouble();
            System.out.print("Enter breadth: ");
            double breadth = sc.nextDouble();

            rectangles[i] = new Rectangle(length, breadth);
        }

        for (int i = 0; i < n; i++) {
            System.out.println("\nRectangle " + (i + 1) + " Information:");
            rectangles[i].displayInfo();
        }

        sc.close();
    }
}
