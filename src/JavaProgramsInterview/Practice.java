package JavaProgramsInterview;

import java.util.HashMap;
import java.util.Map;

public class Practice{
	
	
	public static void main(String args[])  {

	String s="hello world pune";
	String[] split = s.split(" ");
	String rev="";
	for(String kk:split) {
		
		if( kk.equals("world")) {
			for(int i=kk.length()-1;i>=0;i--)
			{
				rev=rev+kk.charAt(i);
			}
			System.out.println(rev+" ");
		}
		else {
			System.out.print(kk+" ");
		}
			
	}
	

		
	}	
}
		