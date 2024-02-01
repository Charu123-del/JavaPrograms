package ExOne;

public class InstanceEx {

	public static void main(String[] args) {
		
		A a1 = new A();
		A a2 = new A();
		A a3 = new A();
		
		System.out.println(A.getInstanceCount());
	}

}


class A
{
	private int count =0;    //compile error - 
	public static int getInstanceCount() {
		return count;   //compile error - static method cannot invoke non-static var
	} 
	
	public A() {
		count++;
	}
}




