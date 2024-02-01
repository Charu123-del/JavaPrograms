package ExOne;

import java.util.ArrayList;

public class OneTest {

	public static void main(String[] args) {
		
		ArrayList<String> list = new ArrayList<String> ();
		int i=0;
		list.add("Test1");
		list.add("Test2");
		
		for(String s : list) {
			list.add("Test" +i);
			i++;
			System.out.println(s);
		}
		

	}
}




/*

Test1
Exception in thread "main" java.util.ConcurrentModificationException
	at java.base/java.util.ArrayList$Itr.checkForComodification(Unknown Source)
	at java.base/java.util.ArrayList$Itr.next(Unknown Source)
	at ExOne.OneTest.main(OneTest.java:14)
	
 */