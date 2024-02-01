package JavaProgramsInterview;

public class FindMissingNum {

	public static void main(String[] args) {
		
		int ar[] = {1,2,4,5};
		int sum =0;
		
		for(int i=0;i<ar.length;i++)
		{
			sum=sum+ar[i];
		}
		System.out.println("sum is::" +sum);
		
		
		int sum1 =0;
		
		for(int j=1;j<=5;j++)
		{
			sum1=sum1+ j ;
		}
		System.out.println("sum is::" +sum1);

		
		
		System.out.println("Missing num is--" +(sum1 - sum));
	}

}
