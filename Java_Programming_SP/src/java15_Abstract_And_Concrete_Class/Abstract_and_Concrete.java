package java15_Abstract_And_Concrete_Class;


/*
 *---------------------- 1. What are concrete methods?----------------------
 * 
 * classes that are having the concrete methods.
 * Any methods that are having the implementation in it called concrete methods.
 * 
 * 
 * ---------------------2. What are abstract classes?-----------------------
 * 
 * Classes that are having abstract methods are called as abstract classes.
 * abstrect methods are those methods which will do not having implementattions.
 * abstract methods will have abstract keyword and ends with semicolan.
 * 
 * 				ex: abstract void shiva();
 * 
 * 
 * -----------------Important points on abstract methods.------------------------
 * 
 * only non_Static mehtods can be abstract.
 * 
 * Every absract method needs to be overridden in the child class.
 * 
 * abstract methods can never be presents in the childest class.
 * 
 * Abstact class can have both concrete and abstract method,
 *  whereas in concrete class only concrete methods will be there.
 * 
 */

abstract class hellow 
{
	abstract void add();
}


public class Abstract_and_Concrete extends hellow {
	
	void add() {
		System.out.println("i am in child class");
	}
	public static void main(String[] args) {
		
		Abstract_and_Concrete ab= new Abstract_and_Concrete();
		ab.add();
	}

}
