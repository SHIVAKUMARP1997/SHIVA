package java14_Inheritance;


/*
 * 1. What is inheritance?
 * 	inheriting the properties from parent class to child class.
 *      here properties are : methods(Static & non_Static) and variables.
 *      
 *  we can’t inherit private methods and variables of a class.
 *  
 *  Constructor can never be inherited in java.
 * 
 * 	Super / Parent class : class which shares their properties to their child.
 * 
 *  Sub / child class : Class which inherits the properties from the parent class. 
 * 		
 *  In the inheritance concept the main method/control will always presents in the child class.
 * 
 *  We represent the relationship in inheritance we use the keyword 'extends'.
 * 
 *  If we have non static methods either in parent class OR in the child class,
 *  we always try to create  object for the child class to call the non_Static methods.
 *   
 *   
 *  2. Types of Inheritance.
 *  
 * 		a.Single level inheritance.
 * 		b.Multi level Inheritance.
 * 		c.Multiple level Inheritance.
 * 		d.hierarchical level Inheritance.
 * 		e.Hybrid level Inheritance.
 * 
 * 
 * 
 * A.Single level inheritance.- Inheritance between one parent and one child.
 * 
 * below progrom is the example for a Single level inheritance.
 */

class parent // Parent class
{
	
	static void add() //Static method.
	{
		System.out.println("Hellow i am a static method from parent class");
	}
	
	void sub() //Non_Static method.
	{
		System.out.println("i am non_static,\tu need to create object for the child class to call me");
	}
	
}

 
public class Single_Level_Inheritance extends parent //Main method being a child class.
{

	public static void main(String[] args) {
		
		System.out.println("I am child class, and i inherited the properties form parent");
		add();
		
		Single_Level_Inheritance I = new Single_Level_Inheritance(); // creating object of child's class.
		
		I.sub(); //calling non static method.
		
	}

}
