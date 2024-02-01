package JavaProgramsInterview;

import java.util.ArrayList;

public class DuplicateElementInArr {

	public static void main(String[] args) {
		
		int arr[]= {1,3,4,5,7,2,2,1,6,6};
		ArrayList<Integer> al =new ArrayList<Integer>();
		System.out.println("duplicate elements:");
		for(int i=0; i<arr.length; i++) {
			
			for(int j=i+1; j<arr.length; j++) {
				
				
				if(arr[i]==arr[j]) {
					
					//System.out.println(arr[i]);
					al.add(arr[i]);
				}
			}
			
		}
		System.out.println(al);

	}

}
