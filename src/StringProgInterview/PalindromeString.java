package StringProgInterview;

import java.util.Scanner;

public class PalindromeString {


	public static void main(String[] args) {
		
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("enter String");
		String org_str=sc.next();
		
		String rev="";
		
		
		for(int i=org_str.length()-1;i>=0;i--)
		{
			rev =rev+org_str.charAt(i);
		}
		
		System.out.println("Rev String:" +rev);
		
		
		
		if(org_str.equals(rev))
		{
			System.out.println(org_str+" is palindrome");
		}
		else
		{
			System.out.println(org_str+" is not palindrome");
		}
	}
}
