package java28_Finally_Keywod;


/*
 * Finally block/ keyword
 * 			is used always in the concept of exception handling, no matter try or catch is excecuting.
 * but finally block will always executed.
 * 
 * 
 * syntax:
 * ---------------------------------------------
 * try
 * 	{
 * 
 * 	}
 * catch(exception RV)
 * 	{
 * 	
 * 	}
 * finally
 * 	{
 * 
 * 	}
 * ----------------------------------------------
 * 
 */
public class FinallyBlock_OR_Keyword {

	public static void main(String[] args) {
		try {
			int a = 1/0;  // will throw an exception cause the 1/0 is infinate
			
			System.out.println(a);

		}
		catch(ArithmeticException ex) {
			System.err.println("We handled your exception, value becomes infinity");
		}
		finally {
			System.out.println("Thank you for visiting to us, come again");
		}

	}

}
