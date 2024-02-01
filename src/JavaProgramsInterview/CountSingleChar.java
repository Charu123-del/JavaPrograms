package JavaProgramsInterview;

import java.util.HashMap;
import java.util.Map;

public class CountSingleChar {

	public static void main(String[] args) {
		String str ="i am am in pppppppune";
		//String []split=str.replaceAll(" ", "").split("");
		
		String []split = str.split(" ");
		Map<String,Integer> map= new HashMap<>();
		
		
		for(String ss:split) {
			
			if(map.get(ss)==null) {
				map.put(ss, 1);
			}
			else {
				map.put(ss, map.get(ss)+1);
			}

		}
		//System.out.println("count number--"+map.get("p"));
		
		
		for(Map.Entry<String, Integer> data : map.entrySet())
		{
			System.out.println(data.getKey()+"  "+data.getValue());
		}

	}

}
