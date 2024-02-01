package JavaProgramsInterview;

import java.util.Scanner;

public class CountNumDig {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter String");
		
		String str = sc.next();
		
		String s1 = str.replaceAll("[^a-zA-z]", "");
		
		
		System.out.println("afterreplacement::" +s1);
		
		int count=0;
		
		for(int i=0;i<str.length();i++) {
			count++;
		}
		
		System.out.println("Digit count is ::" +count);
	}

}
