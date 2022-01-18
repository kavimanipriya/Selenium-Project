package week3.day2;

public class CharOccurance {

	public static void main(String[] args) {

		String s1 = "welcome to chennai";
		char c = 'e';
		int count = 0;
		char[] charArray = s1.toCharArray();
		int size = charArray.length;
		System.out.println("Length is: " + size);

		for (int i = 0; i < size; i++) {
			if (s1.charAt(i) == c)
				count++;
		}

		System.out.println("e occurs in " + count + "times");
	}

}
