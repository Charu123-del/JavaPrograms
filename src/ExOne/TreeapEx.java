package ExOne;

import java.util.TreeMap;

public class TreeapEx {

	public static void main(String[] args) {
		
		TreeMap<Integer, String> map = new TreeMap<Integer, String>();
		
		map.put(100, "welcome");
		map.put(103, "hello");
		map.put(101, "one");
		map.put(101, null);
		
		String str = map.get(100);
		map.put(103, str+" world");
		
		System.out.println(map.get(103));

	}

}


//welcome world