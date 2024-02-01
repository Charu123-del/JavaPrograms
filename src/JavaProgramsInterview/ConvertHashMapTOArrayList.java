package JavaProgramsInterview;

import java.util.ArrayList;
import java.util.HashMap;

public class ConvertHashMapTOArrayList {

	public static void main(String[] args) {
		
		HashMap<String, Integer> compMap = new HashMap<String, Integer>();
		
		compMap.put("Persistent", 10000);
		compMap.put("Infosys", 50000);
		compMap.put("Cybage", 80000);
		compMap.put("Tcs", 40000);
		compMap.put("Amdocs", 60000);
	
		System.out.println("HashMap is :"+compMap);
		
		//convert String company values to ArrayList : String
		
		ArrayList<String> compNames = new ArrayList<String>(compMap.keySet());
		System.out.println("Company names(key)::");
		for(String n :compNames)
		{
			System.out.println(n);
		}
		ArrayList<Integer> compEmpl = new ArrayList<Integer>(compMap.values());
		System.out.println("Company Employees(values)::");
		for(Integer n :compEmpl)
		{
			System.out.println(n);
		}
	}

}
