package variables;

public class ClassA {

	static int a = 100;
	int b = 200;
	
	public static void m1() {
		System.out.println("Static method from ClassA");
	}
	
	public void m2() {
		System.out.println("Non static method from ClassB");
		
	}
}
