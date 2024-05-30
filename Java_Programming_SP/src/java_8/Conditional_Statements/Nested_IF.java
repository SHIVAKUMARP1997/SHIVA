package java_8.Conditional_Statements;

/*
 * Syntax of Nested_If is :
 * 
 * IF(Condition)
 * {
 *    if(condition 2)
 *    {
 *      if(Condition 3)
 *      {
 *        if(Condition n){
 *        		Statement;
 *         	   }              
 *         else{
 *           Statement;
 *             }
 *       }
 *    
 *    }
 *    
 * }
 * 
 * We can have have if-else block inside the the else also.
 */

public class Nested_IF {

	public static void main(String[] args) {

   byte s=100, h=67, i=9;
		
		 if(s>h)
		 {
			 if(h>i)
		     {
		         if((s>i) && (h>i))
		          {
		        	 if((h>i) &&(s>i))
		         		{
		         		System.out.println("i am in the 4th if nest");
		         		}              
		          	else{
		          		System.out.println("i am inside the 4th block of else");
		          		}
		         
		          }
		     
		     }
		     
		 }
	 else 
		{
			System.out.println("Default Statements"); 
		}

	}

}
