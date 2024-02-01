package ExOne;


class Grandparent{
	public void print() {
		System.out.println("GP print()");
	}
}


class Parent extends Grandparent{
	public void print() {
		System.out.println("Parent print()");
	}
}

class Child  extends Parent{
	public void print() {
		super.print();
		System.out.println("child print()");
	}
}

public class InheritanceEx {

	public static void main(String[] args) {
		
		Child c = new Child();
		c.print();
	}

}



/*

Parent print()
child print()
 */
