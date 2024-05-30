package java19_thisCallingStatement;


/*
 * This calling statement is used to call one constructor from another constructor within the same class.
 * 
 *	'this' calling statements are of 2 types...
 * 	a.Parameterised,  ---- to call the parameterised constructor within the class.
 * 	b.Non_Parameterised -------to call the non_Parameterised constuctor within the class.
 * 
 * this() calling statement is should
 *  be the first calling statement in the constructor.
 * 
 * Unlike super calling statement, we need to call This() calling statement explicitly.
 * 
 * ANy constructor can never be the combination of super and this() statement.
 * 
 */

class shiva{
	
	shiva(){
		this(100); //calling the constructor from same class
		System.out.println("Shiva");
	}
	
	shiva(int a){
		this(34.56);
		System.out.println("int a shiva");
	}
	
	shiva(double a){
		System.out.println("double a shiva");
	}
	
	
	
}
public class This_CallingStatement  {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new shiva();
	}

}
