package java_6.Methods;

/*
 * ----------------------Method Overriding in java?
 * 		Developing method in my parent class with the same name and the signature as in the child class,
 * 		but with different implementation.
 * 
 * ---------------Rules of ahieving Methodoverriding.
 * 	 
 * 		We can only override the non_Statc method and not Static method.
 * 
 * 		Both the class should have the relation to override. with extends keyword.
 * 
 * 		Both classes should have same method name with same parameters but with diff implementation.
 * 
 * 		We can avoid overriding to any method by using final_Keyword in the parent class.
 * 
 * 
 * ----------------Can we override the main method.?
 * 
 * 		Main method is static in nature and we cannot override.
 * 
 * 		
 *----------------- Can Constructors be overriden?
 * 
 * 		No, cause: Constructors cannot be inherited, as we knew that there should be a relation between the classes,
 * if it is not allowed to establish relation, no Override happens.
 * 
 *------------------ Super-Keyword?
 * 		Super keyword is one of the keyword in java which is only used in Method Overriding concept.
 * to call the parent class implementation and to gather with the child class implementation.
 * 
 * 	super keywords should only be used in the non static methods.
 * 
 * 	Super keyword can be the first line or anyline inside my non_Static method.
 * 
 */


class one
{
	
	
	void shiva() 
	{
		System.out.println("I am from parent class");
	}
	
}

public class MethodOverriding extends one
{
	//@override
	void shiva() 
	{
		System.out.println("hello i am inside the child class");
		super.shiva(); //to get the parent class implementation.
	}

	public static void main(String[] args) {
		
		MethodOverriding m= new MethodOverriding();
		m.shiva();
		
		
		

	}

}
