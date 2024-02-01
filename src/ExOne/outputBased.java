package ExOne;

public class outputBased {

	public static void main(String[] args) {
		
		X x = new X();
		System.out.println(x.i);
		x.methodOfx();

	}

}

class X{
	
	protected int i =678;
	void methodOfx() {
		
		System.out.println(i);
	}
	
}
