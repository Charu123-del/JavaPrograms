package JavaProgramsInterview;

import java.util.ArrayList;

public class ArrayListAmazon {

	public static void main(String[] args) {
	
		int a[]= {4,4,5,5,85,8,9};
		
		//4-2, 5-2
		int count =0;
		ArrayList<Integer> ar=new ArrayList<Integer>();
		
		for(int i=0;i<a.length;i++) 
		{
			if(!ar.contains(a[i])) 
			{
				
				ar.add(a[i]);
				count++;
				
				for(int j=i+1;j<a.length;j++)
				{
					if(a[i]==a[j])
					{
						count++;
					}
					System.out.println(a[i]+"  "+count);
				}
				
			}
			
			
		}
		
	}

}
