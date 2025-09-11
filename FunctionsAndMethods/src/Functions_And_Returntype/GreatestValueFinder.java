package Functions_And_Returntype;
	import java.util.Scanner;
public class GreatestValueFinder {
	public static int getGreatestNumber(int a, int b) {
		if (a>b) {
			return a;
		}
		else {
			System.out.println("a ");
			return b;
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int greatest = getGreatestNumber(a,b);
		System.out.println(greatest);
		sc.close();
	}
	}

