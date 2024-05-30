package java_7.Constructor;

/*
 * 1. What is constructor?
 * 
 * 		it is a special type of method in java, which will have no return type.
 * 
 * 		Constructor will always have the same name as the class name.
 * 
 * 		Constructor can have all type of access_specifiers.
 * 
 * 		Constructors can be of 2 types, parameterized or non_parameterized.
 * 
 * 		Constructor will always non_Static in nature, So object needs to be created to invoke.
 * 
 * 		Constructors are automatically invoked once the object has been created.
 * 
 *      We cannot have multiple Constructors with same parameters.
 *      
 *  We can have multiple Constructors in a class with different forms of parameters.|OVERLOADING
 *      
 * 2. Constructor Overloading.
 * 
 *    Anyway we know that constructor will always having the name same as the class name.
 * if there is multiple constructors more than 2 in a class then there must be Constructor overloading.
 * 
 *      "developing constructors with same name but different parameters" is Constructor overloading.
 */


public class Constructor {
	
	Constructor() // non_Parameterized constructor.
	{
		System.out.println("i am Non_Parameterized constructor");
	}
	
	
	Constructor(int a) // Parameterized constructor.
	{
		System.out.println("i am Parameterized with parameter value " +a);
	}

	Constructor(char a)//Parameterized and overloaded.
	{
		
		System.out.println("i am parameterized and overloaded");
	}
	
	
	
	
	public static void main(String[] args) {
		
	Constructor c1= new Constructor();// constructor automatically called once the object is created.
	
	new Constructor(); //another method for creating object for Non_parameterized methods.
	
	new Constructor(5);//calling Parameterized constructor.
	
	new Constructor('A');//Constructor overload
	}

}
