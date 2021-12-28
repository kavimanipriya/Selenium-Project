package week1.day2;

public class LearnJumpStatement {

	public static void main(String[] args) {
		//Print 3  in words.
		for(int i =1 ; i<=5; i++)
		{
if(i==3) {
	System.out.println("Three");
	continue; // continue-->stop the current iteration  and continue the next iteration
}
			
		System.out.println(i);
	}
	}

}
