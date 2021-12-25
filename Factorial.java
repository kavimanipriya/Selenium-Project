package week1.day1;

public class Factorial {

	public static void main(String[] args) {
		//input=5
		//output=5*4*3*2*1=120
		
		int number= 5;
		int fact=1;
		 for(int i=1;i<=number;i++)
		 {
			 fact= fact*i;
			 
		 }
		 System.out.println("Factorial of 5 is "+ fact);
		

	}

}
