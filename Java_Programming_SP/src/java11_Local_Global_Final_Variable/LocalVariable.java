package java11_Local_Global_Final_Variable;


/*
 * 1. What are Local Variable?
 * 
 * 		Variables that are declared inside of any method is called as local variable.
 * 
 * 		Scope of the Local variable is from beginning of a method to end of the method. 
 * 		outside the method nobody knows that.
 * 		
 * 		Local variables cannot be declared and utilized directly, initialization has to be happen.
 * 
 *   	Local variable do not have default values.
 *   
 *   	Local variables cannot be distinguished between static and non static.
 *   
 *      Local variables can be declared and initialized in 2 lines, but we cannot for global.
 *
 */


//in this program we have 3 variables 'a' inside 3 different methods, and are NOT-SAME.
public class LocalVariable {
	
	void add()
	{
		int a=10; //Local variable, Static/NonStatic is not allowed.
		System.out.println(a);				
	}
	
	void add(int a) 
	{
		System.out.println(a);
	}

	public static void main(String[] args) 
	{
		int a;
		System.out.println("The variable 'a' will not have scope in other methods"); //Local variable is not having scope inside other method.
		
	}

}
