package Array;

public class ArrayMEthodFindMinNumber {

	public static void m1(int a[]) {
		int b= a[0];//a[0]=11,a[2],a[3],a[4]
		
		for(int i= 1;i<a.length;i++)//0,1,2,3,4
			
			if(b > a[i])//11>4,4>8,4>0,0>14
				b = a[i];//4,0
		
				System.out.println(b);
				
	}
	
	public static void main(String[]args) {
		int a[]= {11,4,8,0,14};
		m1(a);
		
	}
}
