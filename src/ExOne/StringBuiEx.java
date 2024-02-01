package ExOne;

public class StringBuiEx {

	public static void main(String[] args) {
		
		String s="hello";
		StringBuffer sb = new StringBuffer("hello");
		
		sb.reverse();
		//s.reverse();
		
		if(s == sb.toString()) {
			System.out.println("equal");
		}
		else 
			System.out.println("not equal");
		

	}

}



// - not equal

/*

Exception in thread "main" java.lang.Error: Unresolved compilation problem: 
	The method reverse() is undefined for the type String

	at ExOne.StringBuiEx.main(StringBuiEx.java:11)

*/