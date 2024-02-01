
package ArrayListDemo;

import java.util.ArrayList;

public class arrayListCon {

	public static void main(String[] args) {
		
		
		int a[]=new int[3];  //static array  --- size is fix
		
		//Dynamic Array -- ArrayList
		//1.   it can contain DUPLICATE element
		//2.   maintains insertion order
		//3.   allows random access to fetch any element because it stores values on the basis of indexes.
		
		ArrayList ar = new ArrayList();           //its not generic means not defined type of Data  ArrayList like ArrayList<String>
		
		ar.add(10);   //0
		ar.add(20);   //1
		ar.add(30);   //2
		ar.add(40);   //3
		ar.add(30);   //4
		ar.add(67);   //5
		ar.add(40);   //6
		
		System.out.println("size of arrayList::"+ar.size());
		System.out.println(ar.get(3));
		
		//print all values od ArrayList :: for loop  OR  using ITERATOR
		
		System.out.println("Arraylist values using for loop");
		for(int i=0;i<ar.size();i++)
		{
			System.out.println(ar.get(i));
		}
		
		//Non Generics and Generics(after GDK 1.8)
		
		ArrayList<Integer> ar1 = new ArrayList<Integer>();
		
		ar1.add(100);
		//   ar1.add("Java");                     //it will give error as ar1 is generic of type Integer
		
		
		ArrayList<String> ar2 = new ArrayList<String>();
		ar2.add("Java");
		ar2.add("selenium");
		
		
		//addAll
		
		ar.addAll(ar2);
		
		for(int i=0;i<ar.size();i++)
		{
			System.out.println("addAll method of ArrayList::" +ar.get(i));
		}
		
		System.out.println("size of ar after adding ar2::" +ar.size());
		
		
		
		
	}

}
