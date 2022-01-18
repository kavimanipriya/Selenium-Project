package week3.day2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class LearnList {

	public static void main(String[] args) {
		
		 	List list= new ArrayList();
		 	//List<String> list= new ArrayList<String>();
		 	//List<Integer> list= new ArrayList<Integer>();
		 	//<Boolean>
		 	
		 	//Add values to List
		 	list.add("Kavi");
		 	list.add("kayal");
		 	list.add("priya");
		 	list.add("Pranav");
			list.add("Kavi");
		 	System.out.println(list);
		 	//find the size of the list 
		 	
		 int size=list.size();
		 System.out.println(size);
		 
		 //Retrive a data from index
		 
		 String name=(String) list.get(1);
		 System.out.println(name);
		 
		 //remove data from list
		 list.remove(size-1);
		 System.out.println(list);
		 	
// verify the data is present in the list
		 
		boolean contains= list.contains("Babu");
		System.out.println(contains);
		
		//Remove all the data from List
		//list.clear();
		System.out.println(list);
		//compare the 
		boolean empty =list.isEmpty();
		System.out.println(empty);
		
		//List<String> newList= new ArrayList<String>();
		
		
		//Collections.addAll(list,newList);
		Collections.sort(list);
		System.out.println(list);
		Collections.reverse(list);
		
		
		
		 
	}

}
