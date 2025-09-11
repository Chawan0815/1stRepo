package Functions_And_Returntype;
import java.util.Scanner;
	// Enter 3 numbers from user and make a function to print their average
public class AverageCalculator {
	public static double PrintAverage(double num1, double num2, double num3) {
		// Function to calculate and print average
		double average = num1+num2+num3/3;
		System.out.println(average);
		return average;
	}
	public static void main(String[] args) {
		// Taking inputs from user
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Num 1 Value");
		double num1 = sc.nextDouble();
		System.out.println("Enter Num 2 Value");
		double num2 = sc.nextDouble();
		System.out.println("Enter Num 3 Value");
		double num3 = sc.nextDouble();
		PrintAverage(num1,num2,num3); // Calling the function to print average
		sc.close();
	}
}
