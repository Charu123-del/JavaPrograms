package StringProgInterview;

public class SwapString {

	public static void main(String[] args) {
		
		
        String a = "Love";  
        String b = "You";  
        System.out.println("Before swap: " + a + " " + b);  
        a = a + b;                                             //     a = LoveYou
        System.out.println(a.length());
        System.out.println(b.length());
        b = a.substring(0, a.length() - b.length());           //   b = Love
        
        a = a.substring(b.length());  
        System.out.println("After : " + a + " " + b);  
		

	}

}
