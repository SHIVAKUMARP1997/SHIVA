package java27_ExceptionHandling;


/*
 * 1. What is exception handling.
 * 		One of the concept of java using which we can make sure that  program will not be stopped,
 * until there is an end of the program.
 * 
 * Whenever the exception is not in our control-we normally go to exception handling generally.
 * 
 * By the help of the exception handling program will run even there is an exception errors in the program.
 * 
 * Exception handling in java can be handled with the help of the Try and Catch block.
 * Where try and catch both are the java keywords,..
 * 
 * Whichever line in java giving exception can be inside the try block,
 *  and it can be handled inside the catch block..
 *  
 *  syntax of try catch is..:
 *   *  ------------------------------------------------------------------
 *  try{
 *  
 *  }
 *  catch(Exception RV)  // RV - Refference Variable.
 *  {
 *  
 *  }
 * ---------------------------------------------------------------------------
 * Every try can have multiple catch's..
 * Syntax:  
 * 
 * try
 * {
 * 
 * }
 * catch(exception1 RV)
 * {
 * 
 * }
 * catch(exception2 RV2)
 * {
 * 
 * }
 * catch(exceptionn RVn)
 * {
 * 
 * }
 * 
 * Whenever there is an exception only matching catch will excecute.
 * 
 * 
 * 
 */
public class Exception_Handling {

	public static void main(String[] args) {
		try {
			int a = 1/0;  // will throw an exception cause the 1/0 is infinate
			
			System.out.println(a);

		}
		catch(ArithmeticException ex) {
			System.err.println("U r in exception, value becomes infinity");
		}
		
	}

}
