package week1.day2;

public class ArmstrongNumber {

	public static void main(String[] args) {
		/*
		 *To find whether a number is an Armstrong number or not
		 * inputs: 153
		 * output: (1*1*1)+(5*5*5)+(3*3*3) = 153
		 */
 int input=153;
 int orgNumber= input;
 int sum=0;
 
 while (input>0)
 {
	 int rem= input % 10;
	 sum =sum +(rem*rem*rem);
	 input = input /10;
 }
 if (sum == orgNumber)
 {
	 System.out.println("Given Number is an ArmstrongNumber" );
 }
 else {
	 System.out.println("Given Number is not an ArmstrongNumber");
 
 }
	}


}
