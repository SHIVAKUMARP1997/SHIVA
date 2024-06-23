package java24_Arrays;


import java.util.Arrays;
//working fine without the spaces.
import java.util.Scanner;

public class Finding_Special_Characters {

	
	public static void main(String[] args) {
		
		
		Scanner s1 = new Scanner(System.in);
		System.out.println("Enter a value for to count special characters");
		String word = s1.next();
		 int count = 0;

		char[] arr = word.toCharArray();
		System.out.println(Arrays.toString(arr));
		
				for(int i=0; i<word.length(); i++) {
						if(!(Character.isAlphabetic(arr[i])||Character.isDigit(arr[i])||Character.isSpaceChar(arr[i]))){
							count++;
							System.out.println((arr[i]));
						}
			
				}
		System.out.println("Special characters are :" +count);

	}

}
