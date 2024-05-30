package java20_StringFunctions;

/*
 * 
 * String is a predefined class in java.
 * 
 * and we need string functions to manupulate the string.
 * 
 */
public class StringFunction {

	public static void main(String[] args) {
		
		String name =" hellow_i_am_shiva_kumar_bangalore";
		
		System.out.println(name.length()); // int length()
		
		System.out.println(name.charAt(3)); // char charAT(int index)
		
		System.out.println(name.indexOf('v'));// char indexOf()
		
		System.out.println(name.toUpperCase()); // toUpperCase()
		
		System.out.println(name.toLowerCase()); // toLowerCase()
		
		System.out.println(name.concat(" kumar")); // concat("string")
		
		System.out.println(name.contains("sh")); // contains("String")
		
		System.out.println(name.trim()); //trim()

		System.out.println(name.isEmpty()); //isEmpty()
		
		System.out.println(name.substring(19)); //substring()
		
		System.out.println(name.substring(19, 24)); //substring(a,b)
		
		
		
		
		System.out.println("------------------------------------------------");
		String input = "shiva";
		
		for (int i=0; i<input.length(); i++) {
			System.out.println(input.charAt(i)+ "\n");
		}
		
		
		
		// to print the name in reverse.
		for(int j=input.length()-1; j>=0; j--) {
		System.out.print(input.charAt(j));
		}
		
		
		
		
	}


}
