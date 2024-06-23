package java24_Arrays;

public class Palindrome {

	public static void main(String[] args) {
		String str = "madam";
		
		String reverse = "";
		
		for(int i=str.length()-1; i>=0; i--) {
			
			char op = str.charAt(i);
			reverse = reverse + op;
		}
		
		System.out.println(reverse);
		if(str.equals(reverse)) {
			System.out.println("Palindrome");
		}
		else {
			System.out.println("Not a palindrime");
		}
	}

}
