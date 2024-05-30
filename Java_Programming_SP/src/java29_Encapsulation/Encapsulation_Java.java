package java29_Encapsulation;


/*
 * Encapsulation;
 * 		 Restricting the acccess of a variable by making it as private and,
 * providing the indirect access by using 'getter' and 'setter' methods called encapsulation.
 * 
 * 
 * NOTE: As we know, the sensitive variable must be private,
 * and the getter and setter methods should be public.
 * 
 * 
 * 
 * Below program is to show Getter and setter methods.
 */

class Amazon_appl{
	
	private String mail ="shivakumarop@gmail.com";


public String getmail() 
	{
	return mail; // returning the value changed by main method.
	}

public void setmail(String str)
	{
	this.mail= str; //setting the global variable value using this keyword.
	}

}
public class Encapsulation_Java {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Amazon_appl a1=new Amazon_appl();
		a1.setmail("something@gmail.com"); // updating the new value.
		System.out.println(a1.getmail()); //printing the updated value
		
	}

}
