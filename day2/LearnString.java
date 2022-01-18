package week3.day2;

public class LearnString {

	
	public static void main(String[] args) {
		//String literal
		String s="Welcome to Java session";
		String s1="welcome";
		String s2=new String("Welcome");
		char[] ch=new char [7];
		ch[0]='w';
		
		// validate if  both String  have some memory
		
		System.out.println(s==s1);
		
		//Compare the  value
		System.out.println(s.equals(s2));
		System.out.println(s.equalsIgnoreCase(s1));
		
	// find the length of the string
		int length= s.length();
		System.out.println(length);
		
		//convert string to character array
		char[] charArray=s.toCharArray();
		System.out.println(charArray);
		System.out.println(charArray[length-1]);
		
		//get specific character
		
		char charAt=s.charAt(3);
		System.out.println(charAt);
		
		//get the index of the specific  character
		
		int indexOf= s.indexOf('c');
		System.out.println(indexOf);
		
		//how to get part of the string
		System.out.println(s.substring(3));
		System.out.println(s.substring(3,4));
		
		// how to trim
		System.out.println(s.trim());
		
		//convert to uppercase
		System.out.println(s.toUpperCase());
		System.out.println(s.toLowerCase());
		
		//split word in string
		String [] split=s.split(" ");
		System.out.println(split[1]);
		
		//how to replace something in the string
	System.out.println(s.replace("s", "c"));
	
	}
	}
	
