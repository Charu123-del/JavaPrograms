package JavaProgramsInterview;

import java.util.ArrayList;
import java.util.Arrays;

public class RemoveEleFromArray {

	public static void main(String[] args) {
		
		ArrayList<Integer> arr = new ArrayList<Integer>(Arrays.asList(53,33,78,34,99,0,11));
		
		arr.removeIf(number -> (number%10) ==3);
		
		System.out.println(arr);


}
}
