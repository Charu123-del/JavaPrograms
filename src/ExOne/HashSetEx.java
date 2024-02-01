package ExOne;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetEx {

	public static void main(String[] args) {
		
		HashSet<Integer> set = new HashSet<Integer>();
		set.add(10);
		set.add(5);
		set.add(null);
		set.add(67);
		set.add(2);
		set.add(null);
		set.add(4);
		set.add(4);
		
		
		//System.out.println(set);
		
		Iterator<Integer> it =set.iterator();
		
		while(it.hasNext()) {
			System.out.print("  "+it.next());
		}
		

	}

}



// - null2674510