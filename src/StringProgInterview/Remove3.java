package StringProgInterview;

public class Remove3 {

	public static void main(String[] args) {
		String a;
		for(int i=1; i<=100; i++)
		{
			 a=Integer.toString(i);
			if(!a.contains("3"))
			{
				  System.out.println(a);
			}
		}

	}

}
