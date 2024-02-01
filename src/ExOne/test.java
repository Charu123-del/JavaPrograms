package ExOne;

public class test {

	public static void main(String[] args) {
		
		try {
			int i=5;
		}
		catch(Exception e) {
			System.out.println(e);
		}
		catch(NumberFormatException ex)
		{
			System.out.println(ex);
		}
		finally {
			System.out.println("hello");
		}

	}

}
