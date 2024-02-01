package JavaProgramsInterview;

import java.util.Arrays;

public class LargestandSmallestEle {

	public static void main(String[] args) {
		
	int ar[] = {34,78,1,78,4,888889};
		
		int largset= ar[0];
		int smallest = ar[0];
		
		for(int i = 0;i<ar.length; i++) {
			
			if(ar[i]>largset) {
				largset=ar[i];
			}
			else
			{
				smallest=ar[i];
			}
			
		}

		
		System.out.println("Array is ::" +Arrays.toString(ar));
		System.out.println("Largest element is::"+largset);
		System.out.println("Smallest element is::"+smallest);
	}

}
