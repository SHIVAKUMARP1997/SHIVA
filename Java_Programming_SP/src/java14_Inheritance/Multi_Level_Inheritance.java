package java14_Inheritance;


/*
 * Multi level Inheritance.
 * 
 * 		One class inheriting the properties from another class and other class interns the propets of inherited class.
 * 
 *       supermost_class <----Super_class<-------child_class
 * 
 * 
 * 
 */

class supermost //Grand parent class.
		{
			static void add(){
								System.out.println("I am add method and i am a grand parent");
							}
		}


	class super1 extends supermost // Parent class
		{
				static void sub() {
									System.out.println("I am sub method adn i am a parent ");
									}
		}
	
	
		public class Multi_Level_Inheritance extends super1 //Child class
		{

			public static void main(String[] args) {
		
					System.out.println("I am main method i am a child");
					
					add();
					sub();
			}

		}
