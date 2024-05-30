package java_8.Conditional_Statements;

/*
 * 1.Syntax of IF Statement.
 * 
 * 		if(condition){
 * 			Statements;
 * 		}
 * 
 * -->In java for if condition whichever condition is true is going to be executed.
 */

//Program to find the biggest of the given 3 numbers.
public class IF_Statement {

	public static void main(String[] args) {
		
		int a=100, b=2650, c=360;
		
		if((a>b)&&(a>c)) {
			System.out.println(+a+" is bigger among " +a+ " and " +b+ " and " +c);
		}
		
		if((b>a)&&(b>c)) {
			System.out.println(+b+" is bigger among "  +a+ " and " +b+ " and " +c);
		}
		
		if((c>a)&&(c>b)) {
			System.out.println(+c+" is bigger among "  +a+ " and " +b+ " and " +c);
		}

	}

}
