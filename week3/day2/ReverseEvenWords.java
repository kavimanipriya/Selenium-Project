package week3.day2;

import java.util.Arrays;

public class ReverseEvenWords {

	public static void main(String[] args) {

		// Build a logic to reverse the even position words (output: I ma a erawtfos
		// tester)
		String test = "I am a software tester";

		String[] testSplit = test.split(" ");
		System.out.println(Arrays.toString(testSplit));
		int ary = testSplit.length;
		for (int i = 0; i < ary; i++) {
			if (i % 2 == 0) {
				char[] charArray = testSplit[i].toCharArray();

				for (int j = charArray.length - 1; j >= 0; j--)

				{
					System.out.print(charArray[i] + "");
				}

		System.out.println(String.valueOf(charArray));
//System.out.println(String.valueOf(charArray,i));
			}
		}

	}

}
