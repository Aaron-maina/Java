//Number 2
import java.util.Scanner;

public class StudentAverage {
    public static void main(String[] args) {
        // Create a Scanner object for input
        Scanner scanner = new Scanner(System.in);

        // Array to store the marks of five units
        double[] marks = new double[5];

        // Prompt the student to enter the marks of five units
        for (int i = 0; i < 5; i++) {
            System.out.print("Enter the marks for unit " + (i + 1) + ": ");
            marks[i] = scanner.nextDouble();
        }

        // Compute the total and average of the marks
        double total = 0;
        for (double mark : marks) {
            total += mark;
        }
        double average = total / 5;

        // Display the average with two decimal places
        System.out.printf("The average mark is: %.2f%n", average);

        // Close the scanner
        scanner.close();
    }
}
