package java_5.Datatypes;


/*
 * 1.What is datatype?
 *    Every data in programming will be having a type .. called datatype.
 * 
 *---- Datatypes are:---
 * byte
 * short
 * int
 * long
 * float
 * double
 * char
 * boolean
 * String
 * 
 * SYNTAX of datatype and variables.
 * 
 *     "Datatype variable = value;"
 *     
 *     the different size of data type:
 *  -------------------------------   
 *    DataTYPE| Byte  | Bits 
 *  -------------------------------
 *       byte |1 byte | 8 bits   (-128 to 127)
 *     
 *      short |2 byte |16 bits   (-32768 to 32767)
 *     
 *    	 int  |4 byte |32 bits   (      to        )
 *     
 *   	 long |8 byte |64 bits   (      to        )
 *   -------------------------------  
 *     
 *    we have a formula for to find the size range of the datatypes : "-2^(n-1) to 2^(n-1)-1"
 *     where n is the number of bits.
 *     
 *     
 *     DECLARATION --->   INT AGE;
 *     INITIALIZATION---> AGE=10;
 *     declaratin and initialization | int age = 10;
 */

public class Datatypes {

	public static void main(String[] args) {
		
		byte a1 = 56;
		short a2 = 565;
		int a3 = 56789;
		long a4 = 9876657;
		float a5 = 56.789f;
		double a6 = 45.6789234;
		char a9 ='X';
		boolean a10 =false;
		String name = "Shivakumar";

	}

}
