package week3.day2;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SortingUsingCollection {

	public static void main(String[] args) {
		
//		Declare a String array and add the Strings values as (HCL, Wipro,  Aspire Systems, CTS)		
		String[] input = {"HCL","Wipro","Aspire Systems","CTS"};
		
		// covert array to list
		List<String>companies= Arrays.asList(input);
		
//		get the length of the array	
		int size = companies.size();
		

//		sort the array	
		Collections.sort(companies);

//		Iterate it in the reverse order
		for(int i=size-1;i>=0;i--)
		{
			System.out.println(companies.get(i));
		}

//		print the array
		
//		Required Output: Wipro, HCL , CTS, Aspire Systems



	}

}
