package Functions_And_Returntype;

import java.util.Scanner;

public class FunctionsB {
	public static int CalculateProduct(int a, int b) {
		int product = a*b;
		return product;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter A and B Values");
		int a = sc.nextInt();
		int b = sc.nextInt();
		System.out.println("The Product Of A and B ");
		int product = CalculateProduct(a,b);
		System.out.println(product);
	}

}
