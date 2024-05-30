package java14_Inheritance;

public class Hierarchical_2 extends Mul_Parent// acts as a child 2 and has now main method.
{

		static void add() {
		
		int a =100, b=200, c;
		c=a+b;
		System.out.println(c);
		
		
	}
	
public static void main(String[] args) {
	
	
	
	add(); // calling non static method.
	
	
	// calling inherited methods from the parent which is present in othe folder
	meth1();
	meth1(67);
	meth1(15,70);
	}

}
