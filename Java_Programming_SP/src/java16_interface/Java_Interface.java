package java16_interface;

/*
 * 1. What is interface?
 * 
 * 		interface is a class that can only have the abstract methods.
 * 
 * 		intrface can be created with the keyword calles as interface.
 * 
 * 		As we know that interface can only have the abstract methods,
 * 		no need to write abstract keyword infront of the methods in interface. by default they are abstract.
 * 
 * 		We represent the relationship with interface with 'implements' keywords.
 * 
 * 		We cannot create a relationship from interface to class, but from class to interface is possible.
 * 
 * 		Interface will have the abstract method's access specifier as public by default.
 * 
 * 		In interface any variable is always final and static.
 * 
 *   syntax :---------------------
 *   
 *        interface interface_name
 *         {
 *           void add();
 *         }
 *      -----------------------------   
 *         
 */

interface shiva{
	
	 void login();
	
}

public class Java_Interface implements shiva 
{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Java_Interface jav= new Java_Interface();
		jav.login();

	}

	@Override
	public void login() {
		// TODO Auto-generated method stub
		System.out.println("Hello i came from interface");
	}

}
