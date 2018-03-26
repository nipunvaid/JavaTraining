package amdocs.testing.automation.Level1GenericPrograms;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListTest {

	//public static void printWords(List<String> Words) {
		//for(int i=0;i< Words.size();i++) {
			//System.out.println("The value at Position " + (i+1) + " is " + Words.get(i));
		//}	
	//}
	
	//public static void printWords(List<String> Words) {
		//Iterator<String> iterator = Words.iterator();
		//while(iterator.hasNext()) {
			//String word = iterator.next();
			//System.out.println(word + " ");
		//}
	//}
	
	public static void printWords(List<String> Words) {
		for(String word : Words) {
			System.out.println(word + " ");
		}
	}
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> Words = new ArrayList<String>();
		
		//Index Add
		Words.add(0, "at");
		System.out.println("Index Add - Array Size is " + Words.size());
		printWords(Words);
		
		//Normal Add 
		Words.add("school");
		System.out.println("Normal Add- Array Size is " + Words.size());
		//System.out.println(Words.size());
		printWords(Words);
			
		//Update
		Words.set(1, "work");
		System.out.println("Update- Array Size is " + Words.size());
		printWords(Words);
		
		//Remove
		Words.remove(0);
		System.out.println("Remove- Array Size is " + Words.size());
		printWords(Words);
		
		

	}

}
