
package java22_ObjectClass;

/*
 * The Object class defines the basic state and behaviour that all objects must have, 
 * such as the ability to compare oneself to another object, to convert to a string, 
 * to wait on a condition variable, to notify other objects that a condition variable has changed, 
 * and to return the object's class.
 * 
 * Object class is the root of all the classes in Java.
 * 
 * Every calsses in java will inherits the properties of Object class by default.
 */

public class Object_Class extends Object // implicitly inherited by default.

{

	public static void main(String[] args) {
		Object_Class Ob = new Object_Class();
		
		System.out.println(Ob.getClass());
				

	}

}
