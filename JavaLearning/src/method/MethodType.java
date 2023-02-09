package method;

public class MethodType {
 
	public static void m1() {  //it is static method
		System.out.println(" static method does not need object for execution");
	}
	
	public  void m2() {  //it is non static method
		System.out.println(" non static method does need object for execution ");
	}
	
	public static void main(String[]args) {  //it is main method
		System.out.println(" jvm read first method and execute line by line");
		
		m1();
		
		MethodType ob = new MethodType();
		ob.m2();
	}
}
