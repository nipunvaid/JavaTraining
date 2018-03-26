package amdocs.testing.automation.Level1GenericPrograms;

import java.util.ArrayList;
import java.util.List;

public class ListTest {

	@SuppressWarnings({ "unchecked", "rawtypes" })
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List numbers = new ArrayList();
		numbers.add(1);
		numbers.add(2);
		 
		// mistakenly
		numbers.add("test");
		 
		// read the numbers
		for (int i = 0; i < numbers.size(); i++) {
			try {
	            Integer n = (Integer)numbers.get(i);
	            System.out.println(numbers.get(i));
	            // do something with n
	        } catch (ClassCastException e) {
	            System.out.println("Unexcepted type " + e.getMessage());
	        }
		}

	}

}
