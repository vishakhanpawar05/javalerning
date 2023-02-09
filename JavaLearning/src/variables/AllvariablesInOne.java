package variables;

public class AllvariablesInOne {

	static int a = 10; //static variable
	int b = 40;        //non static variable
	
	public void m1() {
		int b = 80;
		System.out.println(b);
		System.out.println(this.b);
		//-	If name of local variable is same as Non static variable then to 
		//access Non static variable  inside Non static Method 
		//we will use “this” keyword
		
	}
	 
	public static void main(String[] args) {
		int c = 50;   //local variable
		int a = 20;
	
		AllvariablesInOne ob = new AllvariablesInOne();
		
		System.out.println(a);
		System.out.println(AllvariablesInOne.a);
		//-	If name of Local Variable is same as Static Variable then to 
		//access static variable in any method ClassName.VariableName
		//(Only for static variable)

		ob.m1();
		
		
	}
}
