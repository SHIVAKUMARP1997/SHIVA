package pattern_Problems;

import java.util.Scanner;

public class Right_angle_Pattern {
	
 public static void main(String args[]) {
	 Scanner sc = new Scanner(System.in);
	 System.out.println("Enter the Value for n \n");
	 int rows = sc.nextInt();
	 
		    for(int i = rows; i >= 1; --i) {
		      for(int space = 1; space <= rows - i; ++space) {
		        System.out.print("  ");
		      }

		      for(int j=i; j <= 2 * i - 1; ++j) {
		        System.out.print("* ");
		      }

		      for(int j = 0; j < i - 1; ++j) {
		        System.out.print("* ");
		      }

		      System.out.println();
		    }
	 sc.close();
   }

}
