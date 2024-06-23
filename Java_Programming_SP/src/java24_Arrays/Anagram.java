package java24_Arrays;

import java.util.Arrays;

/*
 * Anagraqm is actually  2 words having all the caracters, in each other.
 * 
 * ex: bread, beard
 * 	ear, are
 * ...etc...
 * 
 */
public class Anagram {

	public static void main(String[] args) {
		String in1 = "beard";
		String in2 = "bread";
		
		
		if(in1.length()==in2.length()) {
			//convert into the array to compare the indexes.
			char[] c1 = in1.toCharArray();
			char[] c2 = in1.toCharArray();
		
			//Sort the arrays. to have a ascending order 
			Arrays.sort(c1);
			Arrays.sort(c2);
			
			//compare Sorted arrays:
			if(Arrays.equals(c1, c2)) {
				System.out.println("It is an Anagram");
			}
			
		}
		else {
			System.out.println("Length of string is not  same so Probably not an Anagram");
		}


	}

}
