package HashMapConcept;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class HashMapCon {

	public static void main(String[] args) {
		
		//HashMap is a class implements Map Interface
		//extends AbstractMap
		//it contains only unique elements
		//stores the values on the form of key and value pair 
		//it may have one null key and mulitple null values
		//it maintains no order
		//HashMap is non-synchronised
		
		HashMap<Integer, String> hm = new HashMap<Integer, String>();
		hm.put(1, "Selenium");
		hm.put(2, "QTP");
		hm.put(3, "TestComplete");
		hm.put(4, "RFT");

		System.out.println(hm.get(2));  //to get value of key
		
		//print all vlaues of HashMap
		
		for(Entry m : hm.entrySet()) {
			System.out.println(m.getKey()+" "+m.getValue());
		}
		
		
		System.out.println(hm);
		hm.remove(3);
		
		System.out.println(hm);
		
		HashMap<Integer, HashMapConEmployee> emp =new HashMap<Integer, HashMapConEmployee>();
		
		HashMapConEmployee e1 = new HashMapConEmployee("Tom", 25, "Admin");
		HashMapConEmployee e2 = new HashMapConEmployee("Peter", 26, "QA");
		HashMapConEmployee e3 = new HashMapConEmployee("Steve", 27, "Dev");
		
		emp.put(1, e1);
		emp.put(2, e2);
		emp.put(3, e3);
		
		//traverse the hashmap 
		
		for(Entry<Integer,HashMapConEmployee> m : emp.entrySet())
		{
			int key = m.getKey();
			HashMapConEmployee e = m.getValue();
			
			System.out.println("Employee " +key + " Info::");
			
			System.out.println(e.name+" "+e.age+" "+e.dept);
		}

	}

}
