package java_8.Conditional_Statements;

/*
 * Syntax of IF-ELSE statement.
 * 
 *   if(condition){
 *      Statements;
 *   }
 *   else{
 *      statements;
 *   }
 *   
 *   
 *   *if the condition becomes false the else block will be executed by default/
 *    
 */
public class IF_Else_Statement {

	public static void main(String[] args) {
		int age=20;

		if(age>18) {
			System.out.println("i can vote");
		}
		else {
			System.out.println("i am below 18");
		}

	}

}
