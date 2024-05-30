package java43_Throw_ThrowsKeyword;

/*
 * throws :  is not mandatory , declaring it to understand that the code is going to throw an exception.
 * 
 * To throw an exception throw is mandatory and the throws keyword is not mondatory.
 * 
 * 
 */

public class Throw_and_Throws {
	
	void add() throws InterruptedException 
	{
		
		Thread.sleep(500);
	}

	public static void main(String[] args) throws ClassCastException,InterruptedException
	{
		
		
		Thread.sleep(300);
		throw new ClassCastException("Not possible");

	}

}
