package ExOne;

public class OpBase2 {

	public static void main(String[] args) {
		
		Test obj = new Test();
		obj.set(obj.array, 0);
		obj.set(obj.array, 1);
		obj.func();

	}

}


class Test{
	
	boolean[] array = new boolean[3];
	int count = 0;
	
	void set(boolean[] arr, int x) {
		arr[x] = true;
		count ++;
	}
	
	void func() {
		if(array[0] && array[++count -2] | array[count  -1])
			count++;
		
		System.out.println("count = " + count);
	}
}
