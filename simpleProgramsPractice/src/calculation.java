import java.util.Scanner;

public class calculation {

    // Method to check if a number is prime
    public static boolean isPrime(int num) {
        if (num <= 1) return false;
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) return false;
        }
        return true;
    }

    // Method to check if a number is palindrome
    public static boolean isPalindrome(int num) {
        int original = num, reversed = 0;
        while (num != 0) {
            int digit = num % 10;
            reversed = reversed * 10 + digit;
            num /= 10;
        }
        return original == reversed;
    }

    // Method to check if a number is perfect
    public static boolean isPerfect(int num) {
        if (num < 1) return false;
        int sum = 0;
        for (int i = 1; i < num; i++) {
            if (num % i == 0) {
                sum += i;
            }
        }
        return sum == num;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of n: ");
        int n = sc.nextInt();
        
        System.out.println("Choose an operation:");
        System.out.println("1. Find Prime Numbers");
        System.out.println("2. Find Palindrome Numbers");
        System.out.println("3. Find Perfect Numbers");
        System.out.print("Enter your choice (1-3): ");
        int choice = sc.nextInt();

        switch (choice) {
            case 1:
                System.out.println("Prime numbers up to " + n + ":");
                for (int i = 2; i <= n; i++) {
                    if (isPrime(i)) {
                        System.out.print(i + " ");
                    }
                }
                break;

            case 2:
                System.out.println("Palindrome numbers up to " + n + ":");
                for (int i = 0; i <= n; i++) {
                    if (isPalindrome(i)) {
                        System.out.print(i + " ");
                    }
                }
                break;

            case 3:
                System.out.println("Perfect numbers up to " + n + ":");
                for (int i = 1; i <= n; i++) {
                    if (isPerfect(i)) {
                        System.out.print(i + " ");
                    }
                }
                break;

            default:
                System.out.println("Invalid choice!");
                break;
        }
        
        sc.close();
    }
}
