package JavaProgramsInterview;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;

public class RemoveDuplicateElementinArray {
	public static void main(String[] args) {
		
		ArrayList<Integer> numbers = new ArrayList<Integer>(Arrays.asList(1,2,3,4,5,1,2,3,4));
	
		
		LinkedHashSet<Integer> numLinkHashSet = new LinkedHashSet<Integer>(numbers);
		
		ArrayList<Integer> withoutDup = new ArrayList<Integer>(numLinkHashSet);
		
		System.out.println(withoutDup);
	}

}
