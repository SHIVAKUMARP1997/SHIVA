package java10_Operators;

/*
 * 
 *	We have 3 types of Logical operators-- AND(&&), OR(||), NOT(!)
 *
 *   table of AND operator:
 *   ---------------------
 *   input | input | o/p |
 *   ---------------------
 *   True  | True  | True|
 *   True  | False | True|
 *   False | True  | True|
 *   False | False |False|
 *   ---------------------
 *   
 *   table of OR operator:
 *   ---------------------
 *   input | input | o/p |
 *   ---------------------
 *   True  | True  | True|
 *   True  | False |False|
 *   False | True  |False|
 *   False | False |False|
 *   ---------------------
 *   
 *   table of NOT operator:
 *   ---------------------
 *   	input | o/p  |
 *   ---------------------
 *   	True  | False|
 *   	False | True | 
 *   ---------------------
 *   
 *   
 */

public class LogicalOperators {

	public static void main(String[] args) {
	
		int	a=100, b=200;
		
		if((a<b)||(a>b)) {
			System.out.println("print 1");
		}
		
		
		if(!(a==10||b==100)) {
			System.out.println("print 2");
		}
		
		
		if(!((a>b)&&(b<a))) {
			System.out.println("print 3");
		}
		
		
	}

}
