package variables;

public class ClassB {

	//•	Calling methods and variables from different classes
	public static void main(String[]args) {
		
		// for static method
		
		//Static method: - className.methodName 
		//Static Variable: - className.VariableNAme

		System.out.println(ClassA.a);
		ClassA.m1();
		
		// for non static method
		
		//Static method: - className.methodName 
		//Static Variable: - className.VariableNAme

		ClassA ob = new ClassA();
		System.out.println(ob.b);
		ob.m2();
	}
	
}
