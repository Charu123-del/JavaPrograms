package JavaProgramsInterview;

import java.util.Scanner;

public class PrimeNum {
	public static boolean isPrimeNum(int num)
	{
		if(num<=0)
		{
			return false;
		}
		
		for (int i=2;i<=num; i++) {
			if(num % 2 == 0) {
				return false;
			}
		}	
		return true;
	}

	public static void getPrimeNum(int num) {
		
		for(int i=0; i<=num; i++) {
			if(isPrimeNum(i)) {
				System.out.println(i +" ");
			}
		}
	}
	public static void main(String[] args) {	
		Scanner sc =new Scanner(System.in);
		System.out.println("enter num::");
		int num = sc.nextInt();
		//isPrimeNum(num);
		System.out.println(isPrimeNum(num));
		
		
		System.out.println("prime num till 7 ::");
		getPrimeNum(7);
		
		
		
	}

}
