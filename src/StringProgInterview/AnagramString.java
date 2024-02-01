package StringProgInterview;

import java.util.Arrays;

public class AnagramString {

	public static void main(String[] args) {
		

		String str ="Mother In Law";
		String str2="Hitler Woman";
		
		String newstr=str.replaceAll("\\s", "");
		String newstr2=str2.replaceAll("\\s", "");
		
		System.out.println(newstr+"   "+newstr2);

		char[] charArray1 = newstr.toLowerCase().toCharArray();
		char[] charArray2 = newstr2.toLowerCase().toCharArray();
		
		Arrays.sort(charArray1);
		Arrays.sort(charArray2);
		
		
		boolean equals1 = Arrays.equals(charArray1, charArray2);
		System.out.println(equals1);


	}

}
