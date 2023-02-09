package variables;

public class NonStaticVariable {

	int a = 10;
	int b = 12;
	
	public static void main(String[] args) {
		NonStaticVariable ob = new NonStaticVariable();
		
		System.out.println(ob.a);
		System.out.println(ob.b);
		
		NonStaticVariable ob1 = new NonStaticVariable();
		
		ob1.a = 200;//object to object we can change value for non static method
		System.out.println(ob1.a);
	}
}
