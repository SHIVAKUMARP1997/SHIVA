package java_9.Looping_Statements;

/*
 * 
 * 	A "looping statement" is a programming instruction that lets you execute 
*	a block of code repeatedly as long as a certain condition is met. 
*	
*	For example, if you want to show a message 100 times, then rather than 
*	typing the same code 100 times, you can use a loop.
*	There are three types of for loops in Java.
*
 *  for loop
 *  while loop
 *  do-While
 *  
 *  
 *  
 *  The Java for loop is used to iterate a part of the program several times. If 
 *		the number of iteration is fixed, it is recommended to use for loop.
 *
 * 1. Syntax of For loop.
 * 
 *   For(initialization; condition; increment/decrement)
 *   {
 *   	Statements;
 *   }
 *   
 *   
 *   The Java for loop is used to iterate a part of the program several times. If 
 *	the number of iteration is fixed, it is recommended to use for loop.
 */

public class For_Loop {

	public static void main(String[] args) {
		for (int i=1; i<=100; i++) {   //printing 100 times
			System.out.println("Shiva" +i);
		}
		
		
		String str = "Selenium";
		//For reversing the string.
		for(int i=str.length()-1; i>=0 ; i--) {
			System.out.print(str.charAt(i));
		}
	}

}
