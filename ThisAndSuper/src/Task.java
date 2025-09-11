
public class Task {
	public Task() {
		System.out.println("Constructor_Task");
	} 
	public Task(String s) {
		this();
		System.out.println("Parameterised Constructor_Task: " +s);
	}
	public static void main(String[] args) {
		Task t = new Task("Abc");
	}
}
