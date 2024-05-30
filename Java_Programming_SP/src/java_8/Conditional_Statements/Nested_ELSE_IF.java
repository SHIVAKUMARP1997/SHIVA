package java_8.Conditional_Statements;


/*
 * Syntax for nested Else-IF
 * 
 * if(Condition){
 * 		Statement 1;
 * }
 * else if(condition2){
 * 		Statement 2;
 * }
 * else if(condition3){
 * 		Statement 3;
 * }
 * else if(condition4){
 * 		Statement 4;
 * }
 * else if(condition n){
 * 		Statement n;
 * }
 * else{
 *     Default Statement;
 *     }
 * 
 */
public class Nested_ELSE_IF {

	public static void main(String[] args) {
		
		int a=10, b=20;
		
			  if(a>b){
			  		System.out.println("1");
			  }
			  else if(a!=b){
				  System.out.println("2");
			  }
			  else if(a>=b){
				  System.out.println("3");
			  }
			  else if(a<=b){
				  System.out.println("4");
			  }
			  else if(a==0){
				  System.out.println("5");
			  }
			  else{
				  System.out.println("6");
			     }

	}

}
