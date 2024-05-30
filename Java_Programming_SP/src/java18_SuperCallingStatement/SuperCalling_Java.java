package java18_SuperCallingStatement;
/*
 * Super calling statement is used to call the parent class constructor 
 * from the child class constructor.
 * 
 * 
 * 
 * we know that the constructor cannot be ovverridden but here it is happening. 
 * by super calling statement
 * 
 * 
 * 2- types of super calling statements.
 *      a. Paarameterised.
 *      		Parameterised super calling statement is used to call the parameterised parent class constructor.
 *      		can only be written in explicitly(forcefully).
 *      
 *      b.non_Parameterised.
 *      		non_Parameterised super calling statement is used to call the Non-Parameterized parent class constructor.
 * 				it can be written in two ways.
 * 					1. implicitly(by itself) , and 2. explicitly(we_write_it)
 * 
 * 
 */


class parent{
	
	// if the parent class constructor is with the parameter then we have to use super(para),
	//-calling method in the 1st line of the child class;.
	parent() {
		System.out.println("Parent");
			}
	
}

class child extends parent{
	child(){
		//super();  by default super calling statement is there.
		System.out.println("Child");
			}
	
}
public class SuperCalling_Java extends child {
	
	SuperCalling_Java(){
		
		//by default super calling statement 'super();' is there
		System.out.println("MAin");
					}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new SuperCalling_Java();
					}

}
