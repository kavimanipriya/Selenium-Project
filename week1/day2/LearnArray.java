package week1.day2;

public class LearnArray {

	public static void main(String[] args) {
		/*int []=int 1D array;
		String []=String array
		data saved with indices
		index start with 0
		length is property to find out the no.of values in array.
		array [index]-> to get single data from array
		Index of  last data
		Arrays.sort(arrayName)
		
		*/
		//declare the array-->size of the array should be declared at the starting
		
		int[] numb =new int[3];
		numb[0]=12;
		numb[1]=7;
		numb[2]=8;
		
		//int [] numb= {12,7,8,6,9}; 
		
		int  lastIndex = numb.length -1;
		
		 System.out.println(numb.length);
		 
		 System.out.println(numb [lastIndex]);	
		 
		 // to sort  the data in the array
		 
		 
		  Arrays.sort(numb);
		 
		 //to print all the data - use for loop
		 
		 for(int i=0;i< numb.length;i++) {
			 System.out.println(numb [i]);
		 }
		 }
		 
		 
		 
		
		
		
		
	}


