package week3.day1;

public class Calculator {

	public void add(int a,int b) {
		int sum=a+b;
		System.out.println("Addition of two number =" +sum);
		
	}
	public void add(int a,int b,int c) {
		int sum=a+b+c;
		System.out.println("Addition of three number =" +sum);
		
	}
	public void mul(int a,int b) {
		int mul=a*b;
		System.out.println("multiplication of two number =" +mul);
		
	}
	public void mul(int a,double b) {
		double mul=a*b;
		System.out.println("multiplication of two number =" +mul);
	}
	
	 //2 methods for subtract (1 method with 2 int args, 1 methods with 2 double args)
	public void sub(int a,int b) {
		int sub=a-b;
		System.out.println("Subtraction of two number =" +sub);
		
	}
	public void sub(double a,double b) {
		double sub=a-b;
		System.out.println("Subtraction of two number =" +sub);
	} 
	// 2 methods for divide (1 method with 2 int args, 1 methods with 1 double arg and 1 int arg)
	public void div(int a,int b) {
		int div=a/b;
		System.out.println("Divison of two number =" +div);
		
	}
	public void div(double a,int b) {
		double div=a/b;
		System.out.println("Divison of two number =" +div);
	} 
	public static void main(String[] args) {
		Calculator calc=new Calculator();
		calc.add(89, 11);
		calc.add(4, 5,11);
		calc.mul(9, 7);
		calc.mul(8, 12.3);
		calc.sub(56, 34);
		calc.sub(98.3, 65.3);
		calc.div(120, 30);
		calc.div(12.5, 5);
		
			}

}
