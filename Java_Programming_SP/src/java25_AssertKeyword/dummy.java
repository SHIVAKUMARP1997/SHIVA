package java25_AssertKeyword;

import java.util.Scanner;

public class dummy {

	public static void main(String[] args) {
		Scanner s1 = new Scanner(System.in);
		String input = s1.next();
		
		int ch = 0;
		for(int i = 0; i<input.length();i++) {
	
			if(input.indexOf(i)==' ') {
						ch =	ch++;
						System.out.println("number of spaces are : " +ch);
			}
			
			
			
			
			
		}
		

	}

}
