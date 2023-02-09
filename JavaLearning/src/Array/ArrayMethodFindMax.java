package Array;

public class ArrayMethodFindMax {

	public static void m1(int a[]) {
		int b= a[0];//a[0]=11,a[2],a[3],a[4]
		
		for(int i= 1;i<a.length;i++)//0,1,2,3,4
			
			if(b < a[i])//11<4,11<8,11<12,11<14
				b = a[i];//11,12,14
		
				System.out.println(b);
				
	}
	
	public static void main(String[]args) {
		int a[]= {11,4,8,12,14};
		m1(a);
		
	}
}
