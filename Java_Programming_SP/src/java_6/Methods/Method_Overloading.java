package java_6.Methods;

/*
 * 1. Method Overloading?
 * --	Developing multiple methods with the same name but with different arguments.
 * 
 * --   We can have n number of methods but they should be having different forms of parameters.
 * 
 * --Since main method is also a method, we can overload the main method with different parameters.
 */

public class Method_Overloading {
	
	void one()  //NonStatic method.
	{
		int a=100;
		System.out.println("i am non static with the value: " +(a+6));
	}
	
	void one(int a) //NonStatic Method with parameter
	{
		
		System.out.println("i am non_Static and overloaded with Parameter : " +a);
	}
	
	static void one(double a, String s)// Static method with Parameter.
	{
		
		System.out.println("i am a static method with 2 parameters: "+a+ " and "+s+" and i am under Overloading");
	}

	public static void main(String[] args) {
		
		one(34.56, "Shiva"); //calling Static method.
		
		Method_Overloading m = new Method_Overloading();//Object creation to call non static methods.
		
		m.one();
		
		m.one(56);
		
        main(556);
	}
	
	public static void main(int a)//Main method also can be overloaded.
	{
	
	   System.out.println("i am a main method i am also overloaded😉😉😉😍");
	}

}
