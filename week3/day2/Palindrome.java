package week3.day2;

public class Palindrome {

	public static void main(String[] args) {
		
		String s = "madam";
		String srev = "";
		
		//Iterate over the String in reverse order
		
		for (int i=s.length()-1;i>=0; i--) {
			srev = srev + s.charAt(i);
		}
			System.out.println(srev);
			if (s.equalsIgnoreCase(srev)) {
				System.out.println("Given string is a Palindrome");
			} else
				System.out.println("Given string is not a Palindrome");
		}

	}


