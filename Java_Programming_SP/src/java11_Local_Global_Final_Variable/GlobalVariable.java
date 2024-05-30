package java11_Local_Global_Final_Variable;

/*
 * 1. GLobal variable.
 * 
 * 	Any variables that are declared outside of the method and inside the class called global variables.
 * 
 *  The scope of the global variable will be from beginning of the class to end of the class.
 *  
 *  Global variables will be having default values, for each datatypes. 
 *  for byte,short,int, long -->0 || for float,double-->0.0 || Boolean --> false ||String ---> NULL
 * 
 *  Global variables can be Static and NOn_Static, 
 *  but for non_Static variables we need to create object for a class to call/access the variables.
 *  
 *  Global variables cannot be declared and initialized in 2 consecutive lines. 
 *  but they can be declared outside the method and initialized inside the methods.
 * 
 */


public class GlobalVariable {
	
	static int age = 34; //Global variable and it can be static can be used anywhere inside the class.
	static double weight; // will have default value 0.0
	
	String name="Postman"; //Non_Static global variable, by creating objects.
	
	
	static void add() {
		System.out.println(age);
		
		GlobalVariable g= new GlobalVariable();//creating object for to call global variables.
	    System.out.println(g.name);
	}

	public static void main(String[] args) {
		
	 add();
     System.out.println(age);
     System.out.println(weight); // weight has no initialization and it is printing default value.
     
     
     GlobalVariable g= new GlobalVariable();
     System.out.println(g.name); //accessing global variable with ref variables.
	}

}
