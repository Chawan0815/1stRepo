package Super_And_This_Keyword_Using_Method_Calling;

public class B extends A {
	public void m1() {
		super.m1();
		System.out.println("m1_B");
	}
	public void m2() {
		System.out.println("m2_B");
		m1();
		this.m1();
		super.m1();
	}
}
