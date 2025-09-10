package Super_And_This_Keyword_Using_Variable;

public class B extends A {
	int x=20;
	public void m1()
	{
		int x=30;
		System.out.println(x);
		System.out.println(this.x);
		System.out.println(super.x);
		
	}
}
