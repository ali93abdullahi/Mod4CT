import java.util.Scanner;

public class Mod4CT {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in); // Create a Scanner object
        double[] numbers = new double[5]; // Create an array of 5 doubles

        // Get the numbers from the user and store them in the array
        for (int i = 0; i < numbers.length; i++) {
            System.out.print("Enter a number: "); // Prompt the user
            numbers[i] = input.nextDouble(); // Get the next double
        }

        double total = 0; // Initialize the total
        double max = numbers[0]; // Initialize the max
        double min = numbers[0]; // Initialize the min
        double average = 0; // Initialize the average
        // Calculate the total, max, min, and average
        for (int i = 0; i < numbers.length; i++) {
            total += numbers[i]; // Add the current number to the total
            if (numbers[i] > max) { // If the current number is greater than the max
                max = numbers[i];
            }
            if (numbers[i] < min) { // If the current number is less than the min
                min = numbers[i];
            }
        }

        average = total / numbers.length; // Calculate the average

        System.out.println("Total: " + total);
        System.out.println("Average: " + average);
        System.out.println("Maximum: " + max);
        System.out.println("Minimum: " + min);
        System.out.println("Interest on total at 20%: " + (total * 0.2));

        input.close();
    }
}
