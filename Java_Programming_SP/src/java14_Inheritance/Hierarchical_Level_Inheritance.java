package java14_Inheritance;


/*
 * 4. What is hierarchical inheritance?
 * 		
 *   In hierarchical inheritance we will have common parent for multiple child.
 *   
 *   We know that the child clss will have main method but here we will be having multiple child classes.
 *   but we will not be having the child classes in different files.
 *   
 *   
 */
class Mul_Parent{
	
	static void meth1() {
		System.out.println("i am method 1 from parent");
	}
	
	
	static void meth1(int a) 
	{
		System.out.println("i am method 2 from parent and my value is "+a);
	}
	
	static void meth1(int a, int b) 
	{
		int c = a+b;
		
		System.out.println("I am method 3 from parent and my value is "+c);
	}
}

public class Hierarchical_Level_Inheritance extends Mul_Parent {

	public static void main(String[] args) {
		
		meth1();
		meth1(5);
		meth1(10,20);
	}

}
