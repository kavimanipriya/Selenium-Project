package week3.day2;

import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicatesCollections {

	public static void main(String[] args) {
		String text = "We learn java basics as part of java sessions in java week1";
		// Initialize an integer variable as count

		// Split the String into array and iterate over it
		String[] Duplicate = text.split(" ");

		Set<String> charSet = new LinkedHashSet<String>();

		for (String str : Duplicate) {
			charSet.add(str);
		}
		System.out.println(charSet);

	}

}
