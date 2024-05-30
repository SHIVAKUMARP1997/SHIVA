package java_9.Looping_Statements;

import java.util.Scanner;

/*
 * 
 *  do_While loop,
 *  
 *    is an exit control loop because it is having the condition at the end of the loop.
 *    
 *    in this looping, the body of do_while runs atleast once before checking the conditions.
 *
 * 
 * 
 * 
 * 
 * 
 */
public class do_While_Loop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
	//REversing any text without space.
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		sc.close();
		//String str="Selenium";
		int i = str.length()-1;
  do {
		System.out.print(str.charAt(i));
		i--;
	}while(i>=0);

  
  
  }
}
