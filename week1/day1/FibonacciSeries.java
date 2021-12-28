package week1.day1;

public class FibonacciSeries {

	public static void main(String[] args) {
		/*
		 * Goal: To find Fibonacci Series for a given range
		 * 
		 * input(range): 8 output: 0, 1, 1, 2, 3, 5, 8, 13

	*/
		int n=6,n1=0,n2=1;
		System.out.println(n1);
		System.out.println(n2);
		
		for(int i=1;i<=n;i++)
		{
			int n3=n1+n2;
			n1=n2;
			n2=n3;
			System.out.println(n3);
		}
		
		}
	

}
