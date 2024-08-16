package java24_Arrays;

import java.lang.reflect.Array;

/*
 * 1. Array?
 * 		arrays are used to store homogeneous values, means same category of data.
 * 
 * Syntax of array------------------------------------------------
 * 
 * String name[]=new String(size);
 * 
 * int name[]=new int(size);
 * 
 * -----------------------------------------------------------------
 * 
 */
public class Java_Array {

	public static void main(String[] args) {
	
		// declaring method 1:
	String shiva[];
	shiva = new String[5];
	
	shiva[0] = "nameOne ";
	shiva[1] = "nametwo ";
	shiva[2] = "nameThree ";
	shiva[3] = "nameFour ";
	shiva[4] = "nameFive ";
	
		for(int i=0; i<=shiva.length-1; i++) 
			{
				System.out.print(shiva[i]);
			}
		
		
		
		
		
	//method 2	
	int[] a = new int[] {3, 5, 6, 7, 4, 3, 9 };
	
	
	System.out.println("\nLength of |Array @ Method 2 is : " +a.length);

	
	for(int i=0; i<=a.length-1; i++) {
		
		for(int j= i+1; j<=a.length-1; j++) {
			
			if(a[i]==a[j]) {
				System.out.println("Duplicate of Array: "+a[j]);
			}
		}
		
	}
	
	
	
	}

	private static Array List() {
		// TODO Auto-generated method stub
		return null;
	}

}
