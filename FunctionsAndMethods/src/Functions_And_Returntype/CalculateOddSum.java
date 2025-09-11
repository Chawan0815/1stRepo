package Functions_And_Returntype;
	// Print odd numbers sum from 1 to n numbers
public class CalculateOddSum {
	public static void PrintOddSum(int n) {
		int sum = 0;
		for (int i=1; i<=n; i+=2) { //Increases by 2 and direct points to odd numbers
			sum += i;
		}
		System.out.println(sum);
	}
	public static void main(String[] args) {
		int n = 10;
		PrintOddSum(n);
	}
}
