package Super_And_This_Keyword_Using_Constructor;

public class TestAA {
	public static void main(String[] args) {
		BB b=new BB();
		BB b1=new BB(10);
		BB b2=new BB("xyz"); // Constructor Calling Using This And Super Keyword
							// If A Constructor Doesn't Has This Keyword Then By Default Super Keyword Is Available in Method
						   // -Which Returns Method Of Super Class
	}
}
