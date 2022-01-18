package week3.day2;

import java.util.Set;
import java.util.TreeSet;

public class FindIntersectionSet {

	public static void main(String[] args) {

		int arr1[] = { 3, 2, 11, 4, 6, 7 };
		int arr2[] = { 1, 2, 8, 4, 9, 7 };
		Set<Integer> printvalue = new TreeSet<Integer>();
		for (int i = 0; i < arr1.length; i++) {
			for (int j = 0; j < arr2.length; j++) {
				printvalue.add(arr1[i]);
				printvalue.add(arr2[j]);

			}
		}

		System.out.println(printvalue);

	}

}
