package StringProgInterview;

public class ReverseString {

	public static void main(String[] args) {
		
		String str = "persistent";
		String rev ="";
		
		char[] charArray = str.toCharArray();
		
		for(int i=charArray.length-1; i>=0 ; i--) {
			
			rev = rev + charArray[i];
		}

		System.out.println("reverse string is :" +rev);
	}

}
