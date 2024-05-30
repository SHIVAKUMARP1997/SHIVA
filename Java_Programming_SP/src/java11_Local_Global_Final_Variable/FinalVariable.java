package java11_Local_Global_Final_Variable;

/*
 * 3. FINAL variables.
 * 
 *   	Final is a keyword, any variables that are with final keyword they cannot change its values.
 *   
 *    	We can make use of final for universal truths or constants.
 *       ex: 1 hour = 60 min
 *       		PI = 3.142
 *       		Gravity = 9.8
 *       		Speed of light = (3 x 10^8 meters per second)
 *       		1 Non_Leap year = 365
 *       		1 Leap_Year = 366
 *       
 *       
 *       
 *   A) Fact of FINAL keyword.
 *      
 *      	Final keyword can be used with the variable, Methods, Class.
 *          
 *          Final-Variable // These variables cannot change its value.
 *          
 *          Final-Method  // These methods cannot be Overriden.
 *          
 *          Final-Class   // These Class cannot be inherited.
 *          
 *          
 * 
 */

final public class FinalVariable //if class is final it cannot be inherited.

{
	
	final static double pi = 3.142; // Final variable cannot changes its value throught the class.
	 
	final static void shiv() // if method is final it cannot be overrriden.
	{
		
		int a=10;
		a=9; // we can change the vlaue if it is not final variable.
		
		final int b =67; // we cannot change the value throught the method.
		System.out.println(a+b);
	}

	public static void main(String[] args) {
		
		shiv();
		System.out.println("Hello i am PI " +pi+ " and i am final and global");
	}

}
