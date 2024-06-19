//Number 3
import java.util.Scanner;

public class DivisibilityChecker {
    public static void main(String[] args) {
        // Create a Scanner object for input
        Scanner scanner = new Scanner(System.in);

        // Ask the user to enter an integer
        System.out.print("Enter an integer: ");
        int number = scanner.nextInt();

        // Check divisibility by integers from 1 to 9
        for (int i = 1; i <= 9; i++) {
            if (number % i == 0) {
                if (i == 5) {
                    int lastDigit = number % 10;
                    if (lastDigit == 0) {
                        System.out.println("The number is divisible by 5 because it ends with a 0 (zero).");
                    } else if (lastDigit == 5) {
                        System.out.println("The number is divisible by 5 because it ends with a 5.");
                    } else {
                        System.out.println("The number is divisible by 5.");
                    }
                } else {
                    System.out.println("The number is divisible by " + i + ".");
                }
            }
        }

        // Handle the special case for 0
        if (number == 0) {
            System.out.println("The number is divisible by all integers.");
        }

        // Close the scanner
        scanner.close();
    }
}
