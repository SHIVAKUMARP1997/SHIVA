package java_8.Conditional_Statements;

/*
 * in conditional statements no matter how many conditions are true, 
 * the very 1st condition is going to be executed.
 * 
 * Syntax of IF-Else_IF.
 * 
 * if(condition){
 * 		Statements;
 * }
 * else if(Condition 2){
 * 		Statements;
 * }
 * else{
 *    default-Statments;
 * }
 */

public class IF_ELSE_IF {

	public static void main(String[] args) {
		int a=100, b=2650, c=360;
		
		if((a>b)&&(a>c)) {
			System.out.println(+a+" is bigger among " +a+ " and " +b+ " and " +c);
		}
		
		else if((b>a)&&(b>c)) {
			System.out.println(+b+" is bigger among "  +a+ " and " +b+ " and " +c);
		}
		
		else{
			System.out.println(+c+" is bigger among "  +a+ " and " +b+ " and " +c);
		}

	}

}
