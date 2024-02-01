package JavaProgramsInterview;

public class ArmStrongNum {

	public static void main(String[] args) {
		int num = 153;
		int sum=0;
		int temp = num;
		while(num>0)
		{
			int d = num%10;
			System.out.println(d);
			
			sum = sum + (d*d*d);
			System.out.println("sum is="+sum);
			num =num/10;
			
		}
		
		if(temp == sum) {
			System.out.println("Armstrong num");
		}
		else {
			System.out.println("Not Armstrong num");
		}

	}

}
