package Super_And_This_Keyword_Using_Constructor;

public class BB extends AA {
	public BB()
	{
		this(10);
		System.out.println("Constructor-B");
	}
	public BB(String s)
	{
		System.out.println("Constructor-String");
	}
	public BB(int i)
	{
		System.out.println("Construcor-int");
	}
}
