package pattern_Problems;

import java.util.Scanner;

public class Right_angle_Pattern {
	
 public static void main(String args[]) {
	 Scanner sc = new Scanner(System.in);
	 System.out.println("Enter the Value for n \n");
	 int rows = sc.nextInt();
	 
	 for (int i = rows; i >= 1; i--) {
         // Printing spaces
         for (int j = 0; j < rows - i; j++) {
             System.out.print(" ");
         }
         
         // Printing stars
         for (int k = 0; k < ( 2 * i - 1); k++) {
             System.out.print("*");
         }
         
         // Moving to the next line
         System.out.println();
     }
	 sc.close();
   }

}
