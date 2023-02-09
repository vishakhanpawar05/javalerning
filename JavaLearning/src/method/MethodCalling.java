package method;

public class MethodCalling {

	public static void method1() {
		System.out.println(" Static method");
	}
	
	public void method2() {
		System.out.println(" first Non static method");
		
			}
	
	public void method3() {
		System.out.println(" second non static method");
		method2();//•Calling Non static method inside another Non-static method
        method1();//•Calling static method inside another Non static method 
	}
	
	public static void main(String[] args) {
		System.out.println(" it main method ");
		
		method1(); //•Calling static method inside another static method
		
		MethodCalling obb = new MethodCalling();
		obb.method3();//•Calling Non static method inside another static method 
		
	}
}
