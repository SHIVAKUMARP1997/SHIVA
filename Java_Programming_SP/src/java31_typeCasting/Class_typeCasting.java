package java31_typeCasting;


/*
 * Class typeCasting.(inheritance involves).
 * 
 * 	converting one class into another class called class typeCasting.
 * 
 * We have two types of Class typecasting.
 * 
 * 		a.UpCasting:--------------------------------------
 * 			-converting the child class object to the superclass type, 
 * 			to utilise the properties of the parent class.
 * 			-can be done by both implicitly and explicitly.
 * 
 * 		b.downCasting:-------------------------------------
 * 			converting the parent class object to the child class type.
 * 			-Down casting is only done once upCasting is done.
 * 			-Can only be done explicitly.
 * 
 */

class parentClass{
	
	
	
}


public class Class_typeCasting extends parentClass {

	public static void main(String[] args) {
	
		//UPCASTING
		
		//implicitly.
		parentClass pc=new Class_typeCasting(); //implicit_Way from child to parent.
		Object ob = new Class_typeCasting();// UPcasting the child to obejct_class.
		
		
		
		//explicitly
		parentClass pc1= (parentClass) new Class_typeCasting();//Explictway_From child to parent.
	
		
		
		
		//DOWNCASTING #Explicitly
		Class_typeCasting ct = (Class_typeCasting) pc1; // where pc1 was parent class
		
	}

}
