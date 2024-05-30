package java12_ScannerClass;


import java.util.Scanner; // method 1 for importing Scanner class. java.utility--> Package, Scanner--> Class
import java.util.*; // importing for the Scanner class method 1, any one method is enough. 

/*
 * 1. Scanner class. (input).
 * 
 * 		Scanner class is predefined class in java, which is used to take the human input at the run time.
 * 
 * 		Scanner class is one of the Final Class in java.
 *      
 *      ref.nextInt(); --int
 *      ref.nextByte(); --byte
 *      ref.nextShort(); --short
 *      ref.nextLong(); --long
 *      ref.nextBoolean(); --true/false
 *      ref.next(); --string
 *      ref.nextFloat(); --float
 *      ref.nextDouble(); --double
 * 
 * 		
 * 
 *  	
 */
public class ScannerClass {

	public static void main(String[] args) 
	{
		
		Scanner ref = new Scanner(System.in);//Scanner class always takes 'System.in' as a parameter
		
		System.out.println("Enter your favourite number above 10\n");
		int i = ref.nextInt();		//--int
		
		System.out.println("Enter your favourite byte abbove 10\n");
		byte b = ref.nextByte();	 		// --byte
		
		System.out.println("Enter your favourite short above 10\n");
		short s = ref.nextShort();  		//--short
		       
		System.out.println("Enter your favourite long above 10\n");
		long l = ref.nextLong();   		//--long
		       
		System.out.println("Enter your favourite boolean pref true\n");
		boolean B = ref.nextBoolean();		//--true/false
		       
		System.out.println("Enter your favourite String 'Shiva'\n");
		String c = ref.next();				//--String
		       
		System.out.println("Enter your favourite float number above 10\n");
		float f = ref.nextFloat();  		//--float
		       
		System.out.println("Enter your favourite double number above 10\n");
		double d = ref.nextDouble(); 		//--double
		ref.close(); // Closing my scanner class
		
		
		
		if((i<=10)||(d<=10)||(s<=10)||(B==false)||(f<=10)||(b<=10)||(l<=10)||(c=="Shiva")) 
		{
				System.err.println(" \nOne of the value is below 10\n");
				System.err.println(" OR the boolean value is "+B+ "\n");
				System.err.println(" OR the String value is 'Shiva' but you entered: " +c);
	              }
		else {
			System.out.println("\nAll are above 10");
		}
		
		
	}

}
