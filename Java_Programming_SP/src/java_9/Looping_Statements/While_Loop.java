package java_9.Looping_Statements;

/*
 * 
 * Syntax of While loop
 * ------------------------------------------
 * while(condition)
 * {
 * 
 * 		Statements;
 *  
 * }
 * ------------------------------------------
 * 
 * 
 */

public class While_Loop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int age=0;
		while (age<5) {
			System.out.println("hellow i am while loop : " +age);
			age++;
		}
		
		String str = "Selenium";
		int i=str.length()-1;
		  while(i>=0) {
			  System.out.print(str.charAt(i));
			  i--;
		  }

	}

}
