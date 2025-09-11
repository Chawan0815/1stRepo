package Functions_And_Returntype;

import java.util.Scanner;

public class Functions {
	public static int CalculateSum(int a, int b) {
		int sum = a+b;
		return sum; // Return sum because it is integer value
	}
	public static void main(String[] args) { // It does not return any value while using void keyword
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter A and B");
		int a = sc.nextInt();
		int b = sc.nextInt();
		System.out.println("Sum Of A and B");
		int sum = CalculateSum(a,b);
		System.out.println(sum);
	}

}
