package week3.day2;

import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicates {

	public static void main(String[] args) {
		//Declare a String as PayPal India
		String s="PayPal India";
		s.replace(" ","");
		
		//Convert it into a character array
		char[] chArray=s.toCharArray();
		
		
		//Declare a Set as charSet for Character
				
		Set <Character> charSet = new	HashSet<Character>();
		
		//Declare a Set as dupCharSet for duplicate Character
		Set <Character> dupSet = new	HashSet<Character>();

//		Iterate character array and add it into charSet

		for (char eachChar:chArray)
		{
			boolean  add=charSet.add(eachChar);
			if(!add) {
				dupSet.add(eachChar);
			}
		}
//		if the character is already in the charSet then, add it to the dupCharSet
		
		System.out.println(dupSet);

		charSet.removeAll(dupSet);
		System.out.println(charSet);
		


	}

}
