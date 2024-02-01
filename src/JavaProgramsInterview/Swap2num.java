package JavaProgramsInterview;

public class Swap2num {

	public static void main(String[] args) {
		int a=10, b=20;
		
		System.out.println("Before swapping:" +a+ " " +b);
		
		a=a+b;     //a= 30 
		b=a-b;     // b= 10
		a=a-b;  //  a= 20 
		
		System.out.println("after swapping:" +a+ " " +b);

	}

}
