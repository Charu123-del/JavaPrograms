package StringProgInterview;

public class StringManipulation {

	public static void main(String[] args) {
	
		String str = "rain have started here";
		
		System.out.println(str.length());
		
		System.out.println(str.charAt(6));
		
		System.out.println(str.indexOf('r'));   // fst occurance
		
		System.out.println("Sec occurance--");
		System.out.println(str.indexOf('e', str.indexOf('e')+1));    //sec occurance
		
		
		
		String date = "29-09-2022";
		System.out.println(date.replaceAll("-", "/"));
		
		
		String testspl = "Hello_world_Selenium";
		
		String[] split1 = testspl.split("_");
		
		for(String s:split1) {
			System.out.println(s);
		}
		
		

	}

}