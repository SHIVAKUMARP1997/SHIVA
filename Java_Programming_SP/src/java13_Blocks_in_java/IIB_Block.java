package java13_Blocks_in_java;

/*
 * We have 2 types of Blocks SIB and IIB..
 * 
 *   "SIB" : Static Initialization Block.
 *   
 *   	* Java starts execution from the main method in the absence od SIB.
 *   
 *   	* If there is an SIB in a program, then that will be the first priority to execute then main method.
 *   
 *      * We can have multiple SIB's in the program and order of execution will be sequential, 
 *      -one by one after that main method will be executed.
 *   
 *   
 *    Syntax of SIB:--------------------------------
 *         
 *          static{
 *          
 *           }
 *
 *    ----------------------------------------------
 *    
 *    
 *   "IIB" : Instance Initialization block.
 *   
 *   	We can have multiple IIb's in the methods.
 *   
 *     The Order of execution between the SIB, Main, IIb, Constructor.. is
 *    1st-->SIB, 
 *    2nd-->Main, 
 *    3rd-->IIb, 
 *    4rth-->Constructor.
 *    
 *   
 *   
 *   
 *   Syntax of IIB:---------------------------------
 *   
 *            {
 *            
 *            }
 *            
 *  -------------------------------------------------          
 *            
 */

public class IIB_Block {
	
	
	static // SIB block
	{
		System.out.println("I am SIB and i am the 1st priority");
	}

	
	{   //IIB block and it should be called by creating an object
		System.out.println("I am IIB and i have been called by creating an object");
		
	}
	
	
	public static void main(String[] args) {
		System.out.println("I am main method i am 2nd priority");
		
		new SIB_Block(); // calling IIB
		
		SIB_Block iib  = new SIB_Block(); //calling iib.
		
		// TODO Auto-generated method stub

	}
	
	IIB_Block(){
		System.out.println(" I am constructor and i will execute once object is created but after IIB");
	}

}
