package amdocs.testing.automation.Level1GenericPrograms;

import java.util.ArrayList;
import java.util.List;

public class GenericMethodTest {

	public static <T> void printList(List<T> numbers) {
		for (T n : numbers) {
			System.out.println(n);
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> ints = new ArrayList<Integer>();
		ints.add(1);
		ints.add(2);
		ints.add(3);
 
		printList(ints);
	}

}
