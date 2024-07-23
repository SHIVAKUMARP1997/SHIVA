package pattern_Problems;


//
//	  *
//   ***
//  *****
// *******



import java.util.Scanner;

public class WorkSheet {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Value for n \n");
		int rows = sc.nextInt(); // Number of rows for the pyramid
		      
		        for (int i = 1; i <= rows; i++) {
		            // Print spaces
		            for (int j = rows - i; j > 0; j--) {
		                System.out.print(" ");
		            }
		            
		            // Print stars
		            for (int k = 1; k <= (2 * i -1); k++) {
		                System.out.print("*");
		            }
		            
		            // Move to the next line
		            System.out.println();
		        }
		    }
		}
		
		
		
		
		
		
	


