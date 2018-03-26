package amdocs.testing.automation.Level1GenericPrograms;

import java.util.ArrayList;

public class ArrayCapacityTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Integer> numbers = new ArrayList<Integer>();
	       int SIZE = 1000000;
	       numbers.ensureCapacity(SIZE);
	       long iStart = System.currentTimeMillis();
	       for (int i = 0; i < SIZE; i++) {
	           numbers.add(i);
	           //System.out.println(numbers.get(i));
	       }
	 
	      numbers.trimToSize();
	      System.out.println("Number of elements is " + numbers.size());
	      long iEnd = System.currentTimeMillis();
	      System.out.println((iStart - iEnd));
	   }

	}
